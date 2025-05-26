package solucion_codigo;

import java.util.ArrayList;


public class Problema1_CarritoDeCompras {
    private Problema1_Producto producto; 
    private int cantidad;
    
    public boolean agregarProducto(String nombre, int cantidadDeseada, ArrayList<Problema1_Producto> catalogo) {
        for (int i = 0; i < catalogo.size(); i++) {
            Problema1_Producto hola = catalogo.get(i);
            if (hola.getNombre().equalsIgnoreCase(nombre)) {
                if (hola.getcantidadDisponible() >= cantidadDeseada) {
                    this.producto = new Problema1_Producto(hola.getNombre(), hola.getPrecio(), cantidadDeseada);
                    this.cantidad = cantidadDeseada;
                    return true;
                } else {
                    System.out.println("Error, falta cantidad en stock");
                    return false;
                }
            }
        }
        System.out.println("No se encontro el producto");
        return false;
    }

    public double calcularTotal() {
        if (producto == null) return 0;
        return producto.getPrecio() * cantidad;
    }

    public void realizarPago(double monto, ArrayList<Problema1_Producto> catalogo) {
        double total = calcularTotal();

        if (monto < total) {
            System.out.println("Error, el monto ingresado es menor al valor a pagar" + (total - monto));
        } else {
            if (total > 1000) {
                double descuento = total * 0.25;
                total = total - descuento;
                System.out.println("Aplicando descuennto del 25%:" + descuento);
            }
            System.out.println("Grcias por su compra, regrese:)");

            
            for (int i = 0; i < catalogo.size(); i++) {
                Problema1_Producto hola = catalogo.get(i);
                if (hola.getNombre().equalsIgnoreCase(producto.getNombre())) {
                    hola.setcantidadDisponible(hola.getcantidadDisponible() - cantidad);
                    break;
                }
            }
        }
    }

    public void mostrarDetalleCompra() {
        if (producto != null) {
            System.out.println("Producto:" + producto.getNombre());
            System.out.println("Cantidad:" + cantidad);
            System.out.println("Precio por unidad:" + producto.getPrecio());
            System.out.println("Total a pagar:" + calcularTotal());
        } else {
            System.out.println("no hay ningun artiuclo en el carrito");
        }
    }
}

