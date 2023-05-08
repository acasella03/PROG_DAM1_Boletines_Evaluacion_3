package prog_boletin34.entidades;

public class EDestajo extends Empleado{
    
    private int numeroCliente;
    private float comision;

    public EDestajo() {
    }

    public EDestajo(String dni, String nombre, String apellidos, String fechaIngreso, int numeroCliente, float comision) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.numeroCliente = numeroCliente;
        this.comision = comision;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    
    public float comisionPorCliente(){
        return this.comision*this.numeroCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Clientes: " + numeroCliente+"\nComisión: "+ comision;
    }
    
    
}
