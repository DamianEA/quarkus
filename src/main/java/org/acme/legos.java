package org.acme;
import java.util.Objects;            //  <-- import dependencias y librerias necesarias
////////////////////////////////////////////////////////////////////////////////////////////////
public class legos { //<-- clase en que declaramos las variables
    private String name;
    private String depa; 
    private float precio;
    private int year;
////////////////////////////////////////////////////////////////////////////////////////////////
    //constructor de la clase legos, donde inicializamos las variables
    public legos (String name, String depa, int precio, int year) {
        this.name = name;
        this.depa = depa;
        this.precio = precio;
        this.year = year;
    }
/////////////////////////////////////////////////////////////////////////////
    //getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepa() {
        return this.depa;
    }
    public void setDepa(String depa) {
        this.depa = depa;
    }

    public int getPrecio() {
        return (int) this.precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
/////////////////////////////////////////////////////////////////////////////
    //hashcode, equals and toString methods
    //hashcode and equals methods are used to compare objects  
    @Override
    public int hashCode() {
        return Objects.hash(name, depa, precio, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        return true;
        if (obj == null) 
        return false;
        if (getClass() != obj.getClass())
        return false;
        legos other = (legos) obj;
        return Objects.equals(name, other.name) && Objects.equals(depa, other.depa) && precio == other.precio && year == other.year;

    }
////////////////////////////////////////////////////////////////////////////////////////////////////
/// //toString method is used to print the object in a readable format
    //este metodo es utilizado para imprimir el objeto en un formato legible
    @Override
    public String toString() {
        return "legos [name=" + name + ", depa=" + depa + ", precio=" + precio + ", year=" + year + "]";
    }

}   
