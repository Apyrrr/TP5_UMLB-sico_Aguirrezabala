package relaciones1a1;

public class Ej10_CuentaBancariaClaveTitular { }

class ClaveSeguridad { private String codigo, ultimaModificacion;
    public ClaveSeguridad(String codigo, String ultimaModificacion) { this.codigo = codigo; this.ultimaModificacion = ultimaModificacion; } }

class TitularCB {
    private String nombre, dni;
    private CuentaBancaria cuenta;                // vuelta (bi)
    public TitularCB(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setCuenta(CuentaBancaria c) { this.cuenta = c; }
}

class CuentaBancaria {
    private String cbu; private double saldo;
    private final ClaveSeguridad clave;           // composición
    private TitularCB titular;                    // asociación bi
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModif, TitularCB t) {
        this.cbu = cbu; this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModif); // creada y poseída por la cuenta
        this.titular = t;
        t.setCuenta(this);
    }
}

