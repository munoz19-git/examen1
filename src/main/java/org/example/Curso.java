package org.example;
import java.util.ArrayList;
import java.util.List;
public class Curso {

    private int id;
    private String titulo;
    private int numMaxAlumnos;
    private int creditos;
    private Catedratico catedratico;
    private List<Alumno> alumnosInscritos;

    public Curso(int id, String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico) {
        this.id = id;
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosInscritos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public boolean verificaEspacio() {
        return alumnosInscritos.size() < numMaxAlumnos;
    }

    public void imprimirDatos() {
        System.out.println("Curso " + id + ":");
        System.out.println("Titulo: " + titulo);
        System.out.println("Num Max Alumnos: " + numMaxAlumnos);
        System.out.println("Creditos: " + creditos);
        System.out.println("Catedratico: " + catedratico.getNombre());
        System.out.println("Alumnos inscritos: " + alumnosInscritos.size());
    }
}

class Asignacion {
    private Alumno alumno;
    private List<Curso> cursos;

    public Asignacion() {
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
