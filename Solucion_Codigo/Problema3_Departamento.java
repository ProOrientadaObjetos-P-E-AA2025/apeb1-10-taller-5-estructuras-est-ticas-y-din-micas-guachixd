package solucion_codigo;

public class Problema3_Departamento {
    private String nombre;
    private int empleados;
    private double produccionAnual;
    private String categoria;

    public Problema3_Departamento(String nombre, int empleados, double produccionAnual) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.produccionAnual = produccionAnual;
        calcularCategoria();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public void setProduccionAnual(double produccionAnual) {
        this.produccionAnual = produccionAnual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
  
    private void calcularCategoria() {
        if (empleados > 20 && produccionAnual > 1000000) {
            categoria = "A";
        } else if (empleados >= 20 && produccionAnual >= 1000000) {
            categoria = "B";
        } else if (empleados >= 10 && produccionAnual >= 500000) {
            categoria = "C";
        } else {
            categoria = "Sin categoria";
        }
    }

    @Override
    public String toString() {
        return "Departamento:" + nombre + ", Empleados:" + empleados + ", Produccion:" + produccionAnual + ", Categoria:" + categoria;
    }
}