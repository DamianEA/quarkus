package org.acme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;



@ApplicationScoped // <-- indica que esta clase es un servicio de aplicacion, y se mantendra viva durante toda la vida de la aplicacion
public class legoService {
    private List<legos> valores = new ArrayList<>();      // <-- lista de legos, donde se guardaran los objetos creados
    

public void addlegos(legos A){
        valores.add(A); // <-- aqui se agrega el objeto a la lista de legos   
    }
public List<legos> getLegos() {
        return Collections.unmodifiableList(valores); // <-- returning the list of legos
    }

public boolean isEmpty() { // <-- checking if the list is empty
        return valores.isEmpty(); // <-- returning true if the list is empty
    }
public int maxPrecio(){
        int max = 0; // <-- variable para guardar el precio maximo
        for (legos legos : valores) { // <-- recorriendo la lista de legos
            if (legos.getPrecio() > max) { // <-- si el precio del lego es mayor que el maximo
                max = legos.getPrecio(); // <-- guardamos el precio en la variable max
            }
        }
        return max; // <-- devolvemos el precio maximo
}
}
    
