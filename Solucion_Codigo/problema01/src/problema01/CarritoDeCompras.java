/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.util.ArrayList;

/**
 *
 * @author abrah
 */
public class CarritoDeCompras {

    public ArrayList<Producto> listaProductos;
    public double montoCliente;
    public double totalPagar;

    public CarritoDeCompras() {
        this.listaProductos = new ArrayList<>();
    }

    public CarritoDeCompras(ArrayList<Producto> productos) {
        this.listaProductos = productos;
    }

    public double calcularTotal() {
        totalPagar = 0;
        for (Producto producto : listaProductos) {
            totalPagar += producto.precio * producto.cantidad;
        }
        return totalPagar;
    }

    public void realizarPago() {
        if (montoCliente > totalPagar) {
            System.out.print("Pago exitoso.");
            System.out.print("\nSobrante: " + (montoCliente - totalPagar));
        } else if (montoCliente < totalPagar) {
            System.out.print("Pago insuficiente.");
            System.out.print("\nFaltante: " + (totalPagar - montoCliente));
        } else {
            System.out.print("Pago exacto realizado.");
            System.out.print("\nSobrante: 0.0");
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("\n\n=== Productos Comprados ===");
        for (Producto producto : listaProductos) {
            System.out.print(producto.toString());
        }

        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Total de efectivo recibido: " + montoCliente);
    }
}
