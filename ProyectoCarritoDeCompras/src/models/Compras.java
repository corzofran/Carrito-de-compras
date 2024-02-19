package models;

import java.util.ArrayList;
import java.time.*;

public class Compras {
    private int id;
    private LocalDate fecha;
    private float total;
    private ArrayList<Producto> listaDeProductos;

    // Constructor
    public Compras(int id, LocalDate fecha, float total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.listaDeProductos = new ArrayList<>();
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }
}
