package POO.Estrella;

public class Estrella {
}
// Atributos de la estrella
public String nombre;
public String tipoEspectral; // Ej: O, B, A, F, G, K, M
public String color;
public String constelacion;
public String forma;
public String galaxia;
public String estadoEvolutivo; // Ej: Secuencia principal, Gigante roja, Enana blanca
public int puntas;
public int edadMillonesAnos;
public double masaSolar; // Comparado con el Sol ( Sol = 1.0 )
public double radioKm;
public double temperaturaKelvin;
public double distanciaAñosLuz;
public double luminosidad;
public boolean esBinaria;
public boolean tienePlanetas;

// Constructor vacío
public Estrella() {
}

public Estrella(String nombre, String tipoEspectral, String color, String constelacion, String forma, String galaxia, String estadoEvolutivo, int puntas, int edadMillonesAnos, double masaSolar, double radioKm, double temperaturaKelvin, double distanciaAñosLuz, double luminosidad, boolean esBinaria, boolean tienePlanetas) {
    this.nombre = nombre;
    this.tipoEspectral = tipoEspectral;
    this.color = color;
    this.constelacion = constelacion;
    this.forma = forma;
    this.galaxia = galaxia;
    this.estadoEvolutivo = estadoEvolutivo;
    this.puntas = puntas;
    this.edadMillonesAnos = edadMillonesAnos;
    this.masaSolar = masaSolar;
    this.radioKm = radioKm;
    this.temperaturaKelvin = temperaturaKelvin;
    this.distanciaAñosLuz = distanciaAñosLuz;
    this.luminosidad = luminosidad;
    this.esBinaria = esBinaria;
    this.tienePlanetas = tienePlanetas;
}


public String getNombre() {
    return nombre;
}

public String getTipoEspectral() {
    return tipoEspectral;
}

public String getColor() {
    return color;
}

public String getConstelacion() {
    return constelacion;
}

public String getForma() {
    return forma;
}
}