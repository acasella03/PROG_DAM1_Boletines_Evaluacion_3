package prog_boletin33;

import java.util.ArrayList;

public class PROG_Boletin33 {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();
        SeleccionFutbol futbolista = new Futbolista(7, "delantero", 20, "Cristiano", "Ronaldo", 39);
        SeleccionFutbol futbolista2 = new Futbolista(10, "delantero", 30, "Lionel", "Mesi", 39);
        SeleccionFutbol entrenador = new Entrenador(514, 514, "Antonio", "Mouriño", 52);
        SeleccionFutbol seleccionador = new Seleccionador(104, "Jorge", "Matrinez", 40);
        SeleccionFutbol masajista = new Masajista("Fisioterapeuta", 15, 10, "Lucía", "Rodríguez", 45);
        SeleccionFutbol masajista2 = new Masajista("Quiropráctico", 10, 30, "Manuel", "Sánchez", 35);
        lista.add(futbolista);
        lista.add(futbolista2);
        lista.add(entrenador);
        lista.add(seleccionador);
        lista.add(masajista);
        lista.add(masajista2);
        System.out.println(lista);
        
        

    }

}
