
package solucion_codigo;

public class Problema1_Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;
    
    public Problema1_Producto() {
        
    }

    public Problema1_Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getcantidadDisponible() {
        return cantidadDisponible;
    }

    public void setcantidadDisponible(int cantidad) {
        this.cantidadDisponible = cantidad;
    }
    
    @Override
    public String toString(){
        return nombre + "Precio de sus insumos" + precio + "Canrtidad de productos" + cantidadDisponible;
    }
    

    
}
