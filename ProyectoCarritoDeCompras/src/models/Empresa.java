package models;

import java.util.ArrayList;

public class Empresa {
    private String id;
    private String direccion;
    private String telefono;
    private ArrayList<Empleado> empleados;

    // Constructor
    public Empresa(String id, String direccion, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empleados = new ArrayList<>();
    }

    // Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
