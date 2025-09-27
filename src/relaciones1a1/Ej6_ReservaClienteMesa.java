package relaciones1a1;

public class Ej6_ReservaClienteMesa { }

class ClienteR { private String nombre, telefono;
    public ClienteR(String nombre, String telefono) { this.nombre = nombre; this.telefono = telefono; } }

class Mesa { private int numero, capacidad;
    public Mesa(int numero, int capacidad) { this.numero = numero; this.capacidad = capacidad; } }

class Reserva {
    private String fecha, hora;
    private ClienteR cliente;                      // asociación unidireccional
    private Mesa mesa;                             // agregación
    public Reserva(String fecha, String hora, ClienteR cliente, Mesa mesa) {
        this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa;
    }
}

