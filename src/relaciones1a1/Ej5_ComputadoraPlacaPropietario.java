package relaciones1a1;

public class Ej5_ComputadoraPlacaPropietario { }

class PlacaMadre {
    private String modelo, chipset;
    public PlacaMadre(String modelo, String chipset) { this.modelo = modelo; this.chipset = chipset; }
}

class Propietario {
    private String nombre, dni;
    private Computadora compu;                     // vuelta (bi)
    public Propietario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setComputadora(Computadora c) { this.compu = c; }
}

class Computadora {
    private String marca, numeroSerie;
    private final PlacaMadre placa;                // composición
    private Propietario propietario;               // asociación bi
    public Computadora(String marca, String ns, String modeloPM, String chipset, Propietario p) {
        this.marca = marca; this.numeroSerie = ns;
        this.placa = new PlacaMadre(modeloPM, chipset); // creada y poseída por Computadora
        this.propietario = p;
        p.setComputadora(this);
    }
}

