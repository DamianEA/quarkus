package org.acme;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;


@Provider // <-- indica que esta clase es un proveedor de excepciones, y se encargara de manejar las excepciones que se lancen en la aplicacion
public class excepciones implements ExceptionMapper<falla> {

public static record Innerexcepciones(String message, String detalle) {
} // <-- clase interna para manejar las excepciones, en este caso el mensaje y el detalle de la excepcion

@Override
public Response toResponse(falla exception) {
    var error = new Innerexcepciones(exception.getMessage(), null);
    return Response.status(404).entity(error).build();
    }
    
}

// define la 'falla' con un getmessage que retorna el mensaje de la excepcion
class falla extends Exception {
    public falla(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
