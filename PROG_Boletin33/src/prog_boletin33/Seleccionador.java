package prog_boletin33;

public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public void concertrarse() {
        System.out.println("El seleccionador está concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador está viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador está entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador está jugando un partido");
    }

    public void seleccionarJugador() {
        System.out.println("El seleccionador está escogiendo un jugador");
    }

    @Override
    public String toString() {
        return "\n\nSELECCIONADOR:\n"+super.toString();
    }
    
}
