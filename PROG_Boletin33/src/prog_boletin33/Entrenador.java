package prog_boletin33;

public class Entrenador extends SeleccionFutbol {

    private Integer idFederacion;

    public Entrenador() {
    }

    public Entrenador(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concertrarse() {
        System.out.println("El entrenador está concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador está viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador está entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador está jugando un partido");
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador está planificando un entrenamiento");
    }

}
