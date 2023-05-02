package prog_boletin34.entidades;

import java.util.GregorianCalendar;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private GregorianCalendar fechaIngreso;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellidos, GregorianCalendar fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "EMPLEADO:\nDNI: " + dni + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nFecha de Ingreso: " + fechaIngreso;
    }
    
    
}
