package prog_boletin33;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID=" + id + "\nNombre=" + nombre + "\nApellidos=" + apellidos + "\nEdad=" + edad;
    }
    
}
