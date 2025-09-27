package relaciones1a1;

public class Ej4_TarjetaClienteBanco { }

class Banco { private String nombre, cuit;
    public Banco(String nombre, String cuit) { this.nombre = nombre; this.cuit = cuit; } }

class Cliente {
    private String nombre, dni;
    private TarjetaDeCredito tarjeta;              // vuelta (bi)
    public Cliente(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setTarjeta(TarjetaDeCredito t) { this.tarjeta = t; }
}

class TarjetaDeCredito {
    private String numero, fechaVencimiento;
    private Cliente cliente;                       // asociación bidireccional
    private Banco banco;                           // agregación
    public TarjetaDeCredito(String numero, String fechaVenc, Cliente cliente, Banco banco) {
        this.numero = numero; this.fechaVencimiento = fechaVenc;
        this.cliente = cliente; this.banco = banco;
        cliente.setTarjeta(this);
    }
}

