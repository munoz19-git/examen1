package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Instanciar 3 alumnos
        Alumno alumno1 = new Alumno("Carlos", "Calle 4", "4567890123", 20);
        Alumno alumno2 = new Alumno("Ana", "Calle 5", "1234567890", 21);
        Alumno alumno3 = new Alumno("Miguel", "Calle 6", "9876543210", 22);

        // Imprimir datos de los alumnos
        System.out.println("Alumnos:");
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
    }
}

class Alumno {

    private static int contadorAlumnos = 1;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    private Asignacion asignaciones;

    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = contadorAlumnos++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void setAsignaciones(Asignacion asignaciones) {
        this.asignaciones = asignaciones;
    }

    public void imprimirDatos() {
        System.out.println("Alumno " + carnet + ":");
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Edad: " + edad);
        if (asignaciones != null) {
            System.out.println("Asignaciones:");
            for (Curso curso : asignaciones.getCursos()) {
                System.out.println("- " + curso.getTitulo());
            }
        }
    }
}