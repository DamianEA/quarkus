package org.acme;

import java.util.List;


public interface servicio {

void addlegos(legos A);// <-- aqui se agrega el objeto a la lista de legos  

List<legos> getLegos(); // <-- returning the list of legos

boolean isEmpty(); // <-- checking if the list is empty

int maxPrecio(); // <-- returning the maximum price of legos  


}
