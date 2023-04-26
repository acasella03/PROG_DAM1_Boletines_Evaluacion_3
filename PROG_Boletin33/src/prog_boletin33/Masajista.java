package prog_boletin33;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private Integer aniosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, Integer aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, Integer aniosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concertrarse() {
        System.out.println("El masajista está concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista está de viaje");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista está en el entrenamiento");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista está en el partido");
    }

    public void darMasaje() {
        System.out.println("El masajista está dando masajes");
    }

    @Override
    public String toString() {
        return "\n\nMASAJISTA:\n"+super.toString()+"\nTitulacion=" + titulacion + "\nAñosExperiencia=" + aniosExperiencia;
    }
    
}
