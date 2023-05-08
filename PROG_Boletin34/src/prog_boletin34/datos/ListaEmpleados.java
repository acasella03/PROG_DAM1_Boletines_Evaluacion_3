package prog_boletin34.datos;

import com.angi.datos.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prog_boletin34.entidades.EContratado;
import prog_boletin34.entidades.EDestajo;
import prog_boletin34.entidades.Empleado;

public class ListaEmpleados {

    Empleado empleadoContratado = new EContratado(PedirDatos.pedirDatos("DNI:"), PedirDatos.pedirDatos("Nombre:"), PedirDatos.pedirDatos("Apellidos:"), PedirDatos.pedirDatos("Ingrese la fecha de ingreso en formato dd/mm/yyyy: "), PedirDatos.pedirFloat("Salario:"));
    ;
    Empleado empleadoDestajo = new EDestajo(PedirDatos.pedirDatos("DNI:"), PedirDatos.pedirDatos("Nombre:"), PedirDatos.pedirDatos("Apellidos:"), PedirDatos.pedirDatos("Ingrese la fecha de ingreso en formato dd/mm/yyyy: "), PedirDatos.pedirEntero("Cantidad de clientes:"), PedirDatos.pedirFloat("Comisión por clientes:"));

    ;
    
    
    public ArrayList<Empleado> agregarEmpleado(ArrayList<Empleado> lista) {
        lista.add(empleadoContratado);
        lista.add(empleadoDestajo);
        return lista;
    }

    public static void mostrarLista(ArrayList<Empleado> lista) {
        //for each
        for (Empleado elemento : lista) {
            System.out.println(elemento);
            if (elemento instanceof EContratado) {
                EContratado e = (EContratado) elemento;
                JOptionPane.showInputDialog(elemento.toString() + e.complementoSalarial());
            } else if (elemento instanceof EDestajo) {
                EDestajo e = (EDestajo) elemento;
                JOptionPane.showInputDialog(elemento.toString() + e.comisionPorCliente());
            }
        }
    }
}
