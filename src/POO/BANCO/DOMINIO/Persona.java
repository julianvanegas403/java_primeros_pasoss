package POO.BANCO.DOMINIO;

public class Banco {
    public String nombre;
    public String gerente;
    public String recencionista;
    public String seguridad
    public String dinero

    public Banco(String nombre, String gerente, String recencionista, String seguridad, String dinero) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.recencionista = recencionista;
        this.seguridad = seguridad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGerente() {
        return gerente;
    }

    public String getRecencionista() {
        return recencionista;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public String getDinero() {
        return dinero;
    }