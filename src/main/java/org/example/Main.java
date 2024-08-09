package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciar 3 catedraticos
        Catedratico catedratico1 = new Catedratico("Juan", "Calle 1", "1234567890", "Profesor");
        Catedratico catedratico2 = new Catedratico("Maria", "Calle 2", "9876543210", "Profesora");
        Catedratico catedratico3 = new Catedratico("Pedro", "Calle 3", "0123456789", "Profesor");

        // Instanciar 3 cursos
        Curso curso1 = new Curso(1, "Matematicas", 2, 5, catedratico1);
        Curso curso2 = new Curso(2, "Fisica", 5, 5, catedratico2);
        Curso curso3 = new Curso(3, "Quimica", 5, 5, catedratico3);

        // Instanciar 3 alumnos
        Alumno alumno1 = new Alumno( "Carlos", "Calle 4", "4567890123", 20);
        Alumno alumno2 = new Alumno( "Ana", "Calle 5", "1234567890", 21);
        Alumno alumno3 = new Alumno( "Miguel", "Calle 6", "9876543210", 22);

        // Crear asignaciones
        Asignacion asignacion1 = new Asignacion();
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);
        alumno1.setAsignaciones(asignacion1);

        Asignacion asignacion2 = new Asignacion();
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);
        alumno2.setAsignaciones(asignacion2);

        Asignacion asignacion3 = new Asignacion();
        asignacion3.addCurso(curso1);
        asignacion3.addCurso(curso3);
        alumno3.setAsignaciones(asignacion3);

        // Imprimir datos de catedraticos, cursos y alumnos
        System.out.println("Catedraticos:");
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();

        System.out.println("\nCursos:");
        curso1.imprimirDatos();
        curso2.imprimirDatos();
        curso3.imprimirDatos();

        System.out.println("\nAlumnos:");
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
    }
    }