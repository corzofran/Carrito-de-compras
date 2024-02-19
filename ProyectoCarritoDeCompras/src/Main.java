import models.*;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner lectura = new Scanner(System.in);
    private static Carrito carrito = new Carrito();
    private static Cliente cliente = new Cliente(1);
    private static Empleado empleados = new Empleado(1);
    public static void main(String[] args) {
        String recibir;
        do {
            System.out.println("Ingresa el id adminitardor/cliente");
            int id = lectura.nextInt();
            if (id == cliente.getId()) {
                int opcion;
                System.out.println("Menu");
                System.out.println("1-Iniciar carrito de compras");
                System.out.println("2-Ver estatus");
                System.out.println("Ingresa una opcion");
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        iniciarCarrito();
                        break;
                    case 2:
                        verEstatus();
                        break;
                }
            } else if (id == empleados.getId()) {
                int opcion;
                System.out.println("Menu");
                System.out.println("1-Agregar productos");
                System.out.println("2-Validar productos");
                System.out.println("Ingresa una opcion");
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
            lectura.nextLine();
            System.out.println("¿Desea continuar (S/N)?");
            recibir = lectura.nextLine();
        } while (recibir.equals("S"));
    }

    public static void iniciarCarrito() {
        String opcion;
        do {
            System.out.println("Ingrese el id del producto");
            int id = lectura.nextInt();
            lectura.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese el nombre del producto");
            String nombre = lectura.nextLine();
            System.out.println("Ingrese el precio del producto");
            double precio = lectura.nextDouble();
            lectura.nextLine(); // Limpiar el buffer después de leer el precio
            System.out.println("Ingrese la cantidad a comprar");
            int cantidad = lectura.nextInt();
            // Crear el producto
            ItemsCarrito producto = new ItemsCarrito(nombre, id, cantidad, precio);
            // Agregar el producto al carrito
            carrito.agregarProducto(producto);
            lectura.nextLine(); // Limpiar el buffer
            System.out.println("¿Desea continuar (si/no)?");
            opcion = lectura.nextLine();
        } while (opcion.equals("si"));
    }


    public static void verEstatus() {
        System.out.println("Estos son los elementos que contiene el carrito:");
        for (ItemsCarrito producto : carrito.getListaDeProductos()) {
            System.out.println(producto.getNombre());
        }
        // Aquí puedes mostrar otros detalles del carrito si es necesario
    }
}
