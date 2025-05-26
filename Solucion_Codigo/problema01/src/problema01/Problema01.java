/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.ArrayList;

/**
 *
 * @author abrah
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Producto> listaProducto = new ArrayList<>();

        listaProducto.add(new Producto("Leche", 0.99, 3));
        listaProducto.add(new Producto("Pan", 1.20, 2));
        listaProducto.add(new Producto("Huevos", 2.50, 1));

        for (Producto producto1 : listaProducto) {
            System.out.print(producto1.toString());
        }

        CarritoDeCompras carrito = new CarritoDeCompras(listaProducto);
        carrito.montoCliente = 10.00;

        System.out.println("\n=== Detalle de Compra ===");
        carrito.calcularTotal();
        carrito.realizarPago();
        System.out.println();
        carrito.mostrarDetalleCompra();

        System.out.println("\n");
    }
}

class Producto {

    public String nombre;
    public double precio;
    public int cantidad;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nPrecio: " + precio
                + "\nCantidad: " + cantidad
                + "\n";
    }

}
