package org.acme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;


@ApplicationScoped // <-- indica que esta clase es un servicio de aplicacion, y se mantendra viva durante toda la vida de la aplicacion
public class legoService {
    private List<legos> valores = new ArrayList<>();      // <-- lista de legos, donde se guardaran los objetos creados
    

public void addlegos(legos A){
        valores.add(A); // <-- aqui se agrega el objeto a la lista de legos   
    }
public List<legos> getLegos() {
        return Collections.unmodifiableList(valores); // <-- returning the list of legos
    }

public Response maxPrecio(){

        if (valores.isEmpty()) { // <-- checking if the list is empty
            return Response.status(404).entity("No hay precios legos en la lista").build(); // <-- returning a 404 response if the list is empty
        }
        else{
            int precios = legos.maxPrecio();
            return Response.ok(precios).build(); // <-- returning the maximum price of legos
        }
    }
}   
