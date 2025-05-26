package solucion_codigo;

import java.util.ArrayList;
import java.util.Scanner;

public class Solucion_Codigo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int opcion;

        ArrayList<Problema1_Producto> catalogo = new ArrayList<>();
        catalogo.add(new Problema1_Producto("lija", 2.5, 1500));
        catalogo.add(new Problema1_Producto("Martillo", 7.50, 1000));
        catalogo.add(new Problema1_Producto("Taladro", 180.65, 1200));

        Problema1_CarritoDeCompras carrito = new Problema1_CarritoDeCompras();

        while (seguir) {
            System.out.println("\nElige un problema para probar:");
            System.out.println("1 - Sistema de Ventas");
            System.out.println("2 - Sistema de Calificaciones");
            System.out.println("3 - Empresa y Departamentos");
            System.out.println("4 - App de la Fiscalia");
            System.out.println("5 - Sistema de Gestion de Conflictos");
            System.out.println("0 - Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    int cantcomprar;
                    double pagado;
                    String prodNombre;
                    boolean agregado;

                    System.out.println("\nProblema 1: Sistema de Ventas");
                    System.out.println("Hola, Bienvenido a Pintulac");
                    System.out.println("Inventario");
                    System.out.println("==========");
                    System.out.println("lija, valor unitario: 2.5, cantidad: 1500");
                    System.out.println("Martillo, valor unitario: 7.50, cantidad: 1000");
                    System.out.println("Taladro, valor unitario: 180.65, cantidad: 1200");

                    System.out.print("Ingrese nombre del producto a comprar: ");
                    prodNombre = sc.nextLine();

                    System.out.print("Ingrese cantidad a comprar: ");
                    cantcomprar = sc.nextInt();

                    agregado = carrito.agregarProducto(prodNombre, cantcomprar, catalogo);

                    if (agregado) {
                        carrito.mostrarDetalleCompra();

                        System.out.print("Ingrese monto pagado: ");
                        pagado = sc.nextDouble();

                        carrito.realizarPago(pagado, catalogo);
                    }
                    break;

                case 2:
                    String nombreEst;
                    int edadEst;
                    String nombreMat;
                    double acd, ape, aa;
                    Problema2_Estudiante est;
                    Problema2_Materia mat;

                    System.out.println("Problema 2: Sistema de Calificaciones");

                    System.out.print("Ingrese nombre del estudiante:");
                    nombreEst = sc.nextLine();

                    System.out.print("Ingrese edad del estudiante:");
                    edadEst = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese nombre de la materia:");
                    nombreMat = sc.nextLine();

                    System.out.print("Ingrese nota ACD(sobre 3,5):");
                    acd = sc.nextDouble();

                    System.out.print("Ingrese nota APE(sobre 3,5):");
                    ape = sc.nextDouble();

                    System.out.print("Ingrese nota AA(sobre 3,0): ");
                    aa = sc.nextDouble();

                    est = new Problema2_Estudiante(nombreEst, edadEst);
                    mat = new Problema2_Materia(nombreMat, acd, ape, aa);
                    est.setMateria(mat);
                    est.verificarNotas();
                    break;

                case 3:
                    String nombreEmp;
                    String ruc;
                    String dir;
                    Problema3_Empresa empresa;
                    int i;
                    String nombreDep;
                    int empleados;
                    double produccion;
                    Problema3_Departamento dep;

                    System.out.println("Problema 3: Empresa y Departamentos");
                    System.out.print("Nombre de la empresa:");
                    nombreEmp = sc.nextLine();
                    System.out.print("RUC:");
                    ruc = sc.nextLine();
                    System.out.print("Direccion:");
                    dir = sc.nextLine();

                    empresa = new Problema3_Empresa(nombreEmp, ruc, dir);

                    for (i = 0; i < 2; i++) {
                        System.out.println("Departamento:" + (i + 1));
                        System.out.print("Nombre del departamento:");
                        nombreDep = sc.nextLine();
                        System.out.print("Numero de empleados:");
                        empleados = sc.nextInt();
                        System.out.print("Produccion anual:");
                        produccion = sc.nextDouble();
                        sc.nextLine();

                        dep = new Problema3_Departamento(nombreDep, empleados, produccion);
                        empresa.agregarDepartamento(dep);
                    }

                    System.out.println("Resumen");
                    System.out.println(empresa);
                    

                case 0:
                    System.out.println("Adios regrese pronto:)");
                    seguir = false;
                    break;

                default:
                    System.out.println("Error inesperado");
                    break;
            }
        }

        sc.close();
    }
}

