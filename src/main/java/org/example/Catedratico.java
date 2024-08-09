package org.example;

public class Catedratico {
    private static int contadorCatedraticos = 1;
    private int codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = contadorCatedraticos++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    public void imprimirDatos() {
        System.out.println("Catedratico " + codigoCatedratico + ":");
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Profesion: " + profesion);
    } // <--- Agrega este paréntesis de cierre

    public static int getContadorCatedraticos() {
        return contadorCatedraticos;
    }

    public static void setContadorCatedraticos(int contadorCatedraticos) {
        Catedratico.contadorCatedraticos = contadorCatedraticos;
    }

    public int getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(int codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}