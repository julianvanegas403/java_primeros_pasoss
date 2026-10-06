package POO.reto_integrador;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el profesor " + getNombre() + ", tengo " + getEdad() + " años y dicto " + getMateria());
    }
}