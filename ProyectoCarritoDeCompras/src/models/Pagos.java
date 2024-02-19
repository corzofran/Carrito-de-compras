package models;

import java.time.LocalDate;

public class Pagos {
    private int id;
    private LocalDate fecha;
    private float monto;
    private String metodoPago;
    private String estado;

    // Constructor
    public Pagos(int id, LocalDate fecha, float monto, String metodoPago, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    // Métodos de acceso

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

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
