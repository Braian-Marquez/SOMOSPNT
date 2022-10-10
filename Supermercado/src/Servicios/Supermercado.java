package Servicios;



public class Supermercado implements Comparable<Supermercado>{

    protected String producto;
    protected int precio;
    protected double contenido;

    public Supermercado() {
    }

    public Supermercado(String producto, int precio, double contenido) {
        this.producto = producto;
        this.precio = (int) precio;
        this.contenido = contenido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = (int) precio;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }




    @Override
    public int compareTo(Supermercado o) {
        if(this.precio==o.precio)

            return -1;

        else if (this.precio<o.precio)
            return 0;

        else
            return    -1;

    }
}
