package Servicios;

public class Higiene extends Supermercado{
    public Higiene() {
    }

    public Higiene(String producto, int precio, double contenido) {
        super(producto, precio, contenido);
    }

    @Override
    public String toString() {
        return "Nombre: " + producto + " /// " + " Contenido: " + (int)contenido +"ml "+" /// "+" Precio: $" + precio ;
    }
}
