package dependenciaUso;

public class Ej12_ImpuestoContribuyenteCalculadora { }

class Contribuyente { private String nombre, cuil;
    public Contribuyente(String nombre, String cuil) { this.nombre = nombre; this.cuil = cuil; } }

class Impuesto {
    private double monto; private Contribuyente contribuyente; // asociación unidireccional
    public Impuesto(double monto, Contribuyente c) { this.monto = monto; this.contribuyente = c; }
    public double getMonto(){ return monto; }
}

class Calculadora {
    public void calcular(Impuesto imp) {                 // dependencia de uso
        System.out.println("Monto a liquidar: " + imp.getMonto());
    }
}

