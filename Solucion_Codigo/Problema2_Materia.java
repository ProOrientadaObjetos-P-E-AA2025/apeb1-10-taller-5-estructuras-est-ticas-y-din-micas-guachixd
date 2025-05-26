package solucion_codigo;

public class Problema2_Materia {
    private String nombre;
    private double notaACD;
    private double notaAPE;
    private double notaAA;

    public Problema2_Materia() {
    }

    public Problema2_Materia(String nombre, double notaACD, double notaAPE, double notaAA) {
        this.nombre = nombre;
        this.notaACD = notaACD;
        this.notaAPE = notaAPE;
        this.notaAA = notaAA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaACD() {
        return notaACD;
    }

    public void setNotaACD(double notaACD) {
        this.notaACD = notaACD;
    }

    public double getNotaAPE() {
        return notaAPE;
    }

    public void setNotaAPE(double notaAPE) {
        this.notaAPE = notaAPE;
    }

    public double getNotaAA() {
        return notaAA;
    }

    public void setNotaAA(double notaAA) {
        this.notaAA = notaAA;
    }

    public double getNotaFinal() {
        return notaACD + notaAPE + notaAA;
    }

    public String toString() {
        return "Materia: " + nombre + ", ACD: " + notaACD + ", APE: " + notaAPE + ", AA: " + notaAA;
    }
}

