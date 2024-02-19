package models;

public class ItemsCarrito {
    private String nombre;
    private int id;
    private int cantidad;
    private double precio; // Cambiado a double

    public ItemsCarrito(String nombre, int id, int cantidad, double precio) { // Cambiado el tipo de precio a double
        this.nombre = nombre;
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() { // Cambiado el tipo de retorno a double
        return precio;
    }
}
