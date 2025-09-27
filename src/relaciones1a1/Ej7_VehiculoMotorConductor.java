package relaciones1a1;

public class Ej7_VehiculoMotorConductor { }

class Motor { private String tipo, numeroSerie;
    public Motor(String tipo, String numeroSerie) { this.tipo = tipo; this.numeroSerie = numeroSerie; } }

class Conductor {
    private String nombre, licencia;
    private Vehiculo vehiculo;                     // vuelta (bi)
    public Conductor(String nombre, String licencia) { this.nombre = nombre; this.licencia = licencia; }
    public void setVehiculo(Vehiculo v) { this.vehiculo = v; }
}

class Vehiculo {
    private String patente, modelo;
    private Motor motor;                           // agregación
    private Conductor conductor;                   // asociación bi
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente; this.modelo = modelo; this.motor = motor; this.conductor = conductor;
        conductor.setVehiculo(this);
    }
}

