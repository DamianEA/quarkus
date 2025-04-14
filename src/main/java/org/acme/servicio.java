package org.acme;

import java.util.List;
import java.util.Optional;


public interface servicio {

void addlegos(legos A);// <-- aqui se agrega el objeto a la lista de legos  

List<legos> getLegos(); // <-- returning the list of legos

Optional<legos> getLegos(String name); // <-- returning the list of legos by id

boolean isEmpty(); // <-- checking if the list is empty

int maxPrecio(); // <-- returning the maximum price of legos  


}
