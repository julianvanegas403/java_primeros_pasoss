package POO.reto_integrador;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Laura", 22, "Ingeniería de Software");
        Profesor p = new Profesor("Carlos", 40, "Programación");

        e.presentarse();
        p.presentarse();
    }
}