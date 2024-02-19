import java.util.ArrayList;
import java.util.ArrayList;

public class Carritos {
    private ArrayList<ItemsCarrito> listaDeProducto;
    private boolean status;
    private String referenciaDePago;
    public Carritos() {
        this.listaDeProducto = new ArrayList<>();
        this.status = false;
        this.referenciaDePago = null;
    }


    public void agregarProducto(ItemsCarrito producto) {
        listaDeProducto.add(producto);
    }


    public ArrayList<ItemsCarrito> getListaDeProductos() {
        return listaDeProducto;
    }

    public int getTamaño() {
        return listaDeProducto.size();
    }

    public void validarCarritoYGenerarReferenciaDePago() {
        if (cumpleCondicionesDeValidacion()) {
            // Genera la referencia de pago
            this.referenciaDePago = generarReferenciaDePago();


            this.status = true;

            System.out.println("Referencia de pago generada: " + this.referenciaDePago);
        } else {
            System.out.println("El carrito no cumple con las condiciones de validación.");
        }
    }

    public String obtenerReferenciaDePago() {
        if (this.status && this.referenciaDePago != null) {
            return this.referenciaDePago;
        } else {
            return "No se ha generado una referencia de pago para este carrito.";
        }
    }
    private boolean cumpleCondicionesDeValidacion() {
        return true;
    }

    private String generarReferenciaDePago() {
        return "ReferenciaGenerada123";
    }
}
