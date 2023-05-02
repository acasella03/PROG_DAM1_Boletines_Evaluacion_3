package prog_boletin34.datos;

import com.angi.datos.PedirDatos;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import prog_boletin34.entidades.EContratado;
import prog_boletin34.entidades.Empleado;

public class ListaEmpleados {
    ArrayList <Empleado> lista=new ArrayList<>();
    
    public ArrayList<Empleado> agregarEmpleado(ArrayList<Empleado> lista) {
        Empleado empleado= new EContratado(PedirDatos.pedirDatos("DNI:"),PedirDatos.pedirDatos("Nombre:"),PedirDatos.pedirDatos("Apellidos:"),GregorianCalendar.getInstance().getTimeInMillis(),PedirDatos.pedirFloat("Salario:"));
        lista.add(empleado);
        return lista;

    }
}
