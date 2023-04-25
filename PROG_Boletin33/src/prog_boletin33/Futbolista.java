package prog_boletin33;

public class Futbolista extends SeleccionFutbol {

    private Integer dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concertrarse() {
        System.out.println("El futbolista está concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista está viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista está entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista está jugando un partido");
    }

    public void entrevista() {
        System.out.println("El futbolista está siendo entrevistado");
    }

    @Override
    public String toString() {
        return "\nDorsal=" + dorsal + "\nDemarcacion=" + demarcacion;
    }

}
