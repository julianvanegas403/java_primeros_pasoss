package POO.reto_integrador;

public class Estudiante extends Persona {
    private String programa;

    public Estudiante (String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy " + getNombre() + ", tengo " + getEdad() + " años y estudio " + getPrograma());
    }
}