package prog_boletin34.entidades;

public class EDestajo extends Empleado{
    
    private int numeroCliente;
    private float comisionPorCliente;

    public EDestajo() {
    }

    public EDestajo(String dni, String nombre, String apellidos, String fechaIngreso, int numeroCliente, float comisionPorCliente) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.numeroCliente = numeroCliente;
        this.comisionPorCliente = comisionPorCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Clientes: " + numeroCliente+"\n";
    }
    
    
}
