package prog_boletin34.presentacion;

import java.util.ArrayList;
import prog_boletin34.datos.ListaEmpleados;
import prog_boletin34.entidades.Empleado;

public class PROG_Boletin34 {
    
    public static void main(String[] args) {
        ListaEmpleados empleados=new ListaEmpleados();
        ArrayList<Empleado> lista = null;
        System.out.println(empleados.agregarEmpleado(lista));
    }
    
}
