package relaciones1a1;

public class Ej1_PasaporteFotoTitular { /* sin main */ }

class Foto {
    private String imagen, formato;
    public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
}

class Titular {
    private String nombre, dni;
    private Pasaporte pasaporte;                   // vuelta (bi)
    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setPasaporte(Pasaporte p) { this.pasaporte = p; }
    public String getNombre() { return nombre; }
}

class Pasaporte {
    private String numero, fechaEmision;
    private final Foto foto;                       // composición
    private Titular titular;                       // asociación bidireccional
    public Pasaporte(String numero, String fechaEmision, Titular titular, String img, String fmt) {
        this.numero = numero; this.fechaEmision = fechaEmision;
        this.foto = new Foto(img, fmt);            // creado y poseído por Pasaporte
        this.titular = titular;
        titular.setPasaporte(this);                // establece la bi-dirección
    }
}
