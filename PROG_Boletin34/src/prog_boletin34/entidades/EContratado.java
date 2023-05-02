package prog_boletin34.entidades;

import java.util.GregorianCalendar;

public class EContratado extends Empleado {

    private float salario;

    public EContratado() {
    }
    
    public EContratado(String dni, String nombre, String apellidos, GregorianCalendar fechaIngreso, float salario) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float complementoSalarial() {
        GregorianCalendar fecha1= new Empleado().getFechaIngreso();
        GregorianCalendar fecha2 = new GregorianCalendar();
        long diferenciaEnMilisegundos = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        double diferenciaEnAnios = Math.floor(diferenciaEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
        if (diferenciaEnAnios>=0 || diferenciaEnAnios<=3){
            salario=(float) ((salario*0.05)+salario);
        }else if (diferenciaEnAnios>=4 || diferenciaEnAnios<=7){
            salario=(float) ((salario*0.10)+salario);
        }else if (diferenciaEnAnios>=8 || diferenciaEnAnios<=15){
            salario=(float) ((salario*0.15)+salario);
        }else if (diferenciaEnAnios>15){
            salario=(float) ((salario*0.20)+salario);
        }
        return salario; 
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalario: " + salario;
    }
    
    
}
