package org.example;

import java.util.ArrayList;
import java.util.List;

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