package Servicios;

public class Frutas extends Supermercado {
   private String unidadVenta;

    public Frutas(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    public Frutas(String producto, int precio, double contenido, String unidadVenta) {
        super(producto, precio, contenido);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + producto + " /// " + " Precio: $" + precio + " /// " +" Unidad de venta: " + unidadVenta;
    }
}
