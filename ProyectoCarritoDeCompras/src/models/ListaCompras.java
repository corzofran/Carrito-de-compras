package models;

import java.util.ArrayList;

public class ListaCompras {
    private int id;
    private String nombre;
    private ArrayList<Producto> listaDeProductos;

    // Constructor
    public ListaCompras(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaDeProductos = new ArrayList<>();
    }

    // Métodos de acceso

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }
}
