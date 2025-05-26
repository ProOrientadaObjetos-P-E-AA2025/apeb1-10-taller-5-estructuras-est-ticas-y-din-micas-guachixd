package solucion_codigo;

public class Problema2_Estudiante {
    private String nombre;
    private int edad;
    private Problema2_Materia materia;

    public Problema2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setMateria(Problema2_Materia materia) {
        this.materia = materia;
    }

    public Problema2_Materia getMateria() {
        return materia;
    }

    public void verificarNotas() {
        double tot, porcentaje;
        
        tot = materia.getNotaFinal();
        porcentaje = (tot / 10.0) * 100;

        System.out.println(materia);

        if (porcentaje >= 70) {
            System.out.println("Estudiante aprobado con" + porcentaje + "%");
        } else {
            System.out.println("Estudiante reprobaprobado con" + porcentaje + "%");
            System.out.println("El estudinate debe rendir el examen de recuperacion (3.5 pts maximo)");
        }
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad;
    }
}

