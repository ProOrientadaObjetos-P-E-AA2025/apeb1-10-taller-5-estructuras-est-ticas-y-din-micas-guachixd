package solucion_codigo;

import java.util.ArrayList;

public class Problema3_Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Problema3_Departamento> departamentos;

    public Problema3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Problema3_Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Problema3_Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Problema3_Departamento x) {
        departamentos.add(x);
    }

    @Override
    public String toString() {
        String res = "Empresa: " + nombre + ", RUC: " + ruc + ", Direccion: " + direccion + "\nDepartamentos:\n";
        return res;
    }
}