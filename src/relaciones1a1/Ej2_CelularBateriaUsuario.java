package relaciones1a1;

public class Ej2_CelularBateriaUsuario { }

class Bateria {
    private String modelo; private int capacidad;
    public Bateria(String modelo, int capacidad) { this.modelo = modelo; this.capacidad = capacidad; }
}

// RENOMBRADA: Usuario -> UsuarioCel
class UsuarioCel {
    private String nombre, dni;
    private Celular celular;                       // vuelta (bi)
    public UsuarioCel(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setCelular(Celular c) { this.celular = c; }
}

class Celular {
    private String imei, marca, modelo;
    private Bateria bateria;                       // agregación
    private UsuarioCel usuario;                    // asociación bidireccional
    public Celular(String imei, String marca, String modelo, Bateria bateria, UsuarioCel usuario) {
        this.imei = imei; this.marca = marca; this.modelo = modelo;
        this.bateria = bateria; this.usuario = usuario;
        usuario.setCelular(this);
    }
}

