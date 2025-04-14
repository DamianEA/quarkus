package org.acme;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/legos")//<-- ruta de la api, en este caso /legos.   public class legos { //<-- clase en que declaramos las variables
public class legosInfo { 
/*private List<legos> valores = new ArrayList<>();      // <-- lista de legos, donde se guardaran los objetos creados*/


private legoService legos; // <-- Initialize legoService

@Inject // <-- inyectando legoService
public legosInfo(legoService legos) { // <-- Constructor e inicializador legoiService  
    this.legos = legos;
 }





/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @POST
    @Produces(MediaType.APPLICATION_JSON) // <-- tipo de respuesta que se espera, en este caso json
    public legos ea(legos mesege) { 
        legos.addlegos(mesege); // <-- aqui se agrega el objeto a la lista de legos   
        return mesege;
    }




    @GET
    @Produces(MediaType.APPLICATION_JSON) // <-- tipo de respuesta que se espera, en este caso json
    public List<legos> listLegos() {
        return legos.getLegos(); // <-- returning the list of legos
    }




    @GET
    @Path("/expensive") // <-- ruta de la api, en este caso /legos/maxPrecio
    @Produces(MediaType.APPLICATION_JSON) // <-- tipo de respuesta que se espera, en este caso json
    public Response maxPrecio() {
        
        if (legos.isEmpty()) { // <-- checking if the list is empty
            return Response.status(404).entity("No hay precios legos en la lista").build(); // <-- returning a 404 response if the list is empty
        } else {
            int precios = legos.maxPrecio();
            return Response.ok(precios).build(); // <-- returning the maximum price of legos
        }

    }

    @GET
    @Path("/{name}") // <-- ruta de la api, en este caso /legos/{name}
    @Produces(MediaType.APPLICATION_JSON) // <-- tipo de respuesta que se espera, en este caso json
    public legos getLegos(@PathParam ("name") String name) throws falla { // <-- returning the list of legos by id
        return legos.getLegos(name).
        orElseThrow(() -> 
        new falla("no hay nd"));// <-- buscando el lego por id
    }

/* 
@GET   
@Produces(MediaType.APPLICATION_JSON) 
public List<legos> list(){
return Arrays.asList(
    new legos("iron man suit", "marvel", 100, 2023)
    ,new legos("batman suit", "dc", 200, 2023)
    ,new legos("harry", "harry potter", 90, 2024)
    ,new legos("owen", "jurassic park", 150, 2022)
    );
    }*/
}