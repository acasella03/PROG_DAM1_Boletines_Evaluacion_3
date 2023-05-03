package prog_boletin34.datos;

import com.angi.datos.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prog_boletin34.entidades.EContratado;
import prog_boletin34.entidades.EDestajo;
import prog_boletin34.entidades.Empleado;

public class ListaEmpleados {
    
    public ArrayList<Empleado> agregarEmpleado(ArrayList<Empleado> lista) {
        JOptionPane.showMessageDialog(null, "Indica empleado con contrato fijo");
        Empleado empleadoContratado= new EContratado(PedirDatos.pedirDatos("DNI:"),PedirDatos.pedirDatos("Nombre:"),PedirDatos.pedirDatos("Apellidos:"),PedirDatos.pedirDatos("Ingrese la fecha en formato dd/mm/yyyy: "),PedirDatos.pedirFloat("Salario:"));
        JOptionPane.showMessageDialog(null, "Indica empleado a destajo");
        Empleado empleadoDestajo=new EDestajo(PedirDatos.pedirDatos("DNI:"),PedirDatos.pedirDatos("Nombre:"),PedirDatos.pedirDatos("Apellidos:"),PedirDatos.pedirDatos("Ingrese la fecha en formato dd/mm/yyyy: "),PedirDatos.pedirEntero("Cantidad de clientes:"),PedirDatos.pedirFloat("Comisión por clientes:"));
        lista.add(empleadoContratado);
        lista.add(empleadoDestajo);
        return lista;
    }
    
    public void mostrarLista(ArrayList<Empleado> lista) {
        //for each
        for (Empleado elemento : lista) {
            System.out.println(elemento);
        }
    }
}
