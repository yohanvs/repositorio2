package Libreria.Entidades;

public class Persona {
    
    private String nombre;
    private int dni;
    private String residencia;

    public Persona() {
    }

    public Persona(String nombre, int dni, String residencia) {
        this.nombre = nombre;
        this.dni = dni;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", residencia=" + residencia + '}';
    }
     
    
    
}
