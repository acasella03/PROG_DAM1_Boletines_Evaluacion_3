package prog_boletin34.entidades;

import java.util.GregorianCalendar;

public class EDestajo extends Empleado{
    
    private int numeroCliente;
    private float complemento;

    public EDestajo() {
    }

    public EDestajo(int numeroCliente, float complemento, String dni, String nombre, String apellidos, GregorianCalendar fechaIngreso) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.numeroCliente = numeroCliente;
        this.complemento = complemento;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public float getComplemento() {
        return complemento;
    }

    public void setComplemento(float complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Clientes: " + numeroCliente + "\nComplemento: " + complemento;
    }
    
    
}
