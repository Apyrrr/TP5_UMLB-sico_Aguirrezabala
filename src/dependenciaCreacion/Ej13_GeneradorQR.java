package dependenciaCreacion;

public class Ej13_GeneradorQR { }

class UsuarioQR { private String nombre, email;
    public UsuarioQR(String nombre, String email) { this.nombre = nombre; this.email = email; } }

class CodigoQR {
    private String valor; private UsuarioQR usuario;     // asociación unidireccional
    public CodigoQR(String valor, UsuarioQR usuario) { this.valor = valor; this.usuario = usuario; }
}

class GeneradorQR {
    public void generar(String valor, UsuarioQR usuario) { // dependencia de creación (no guarda)
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado con valor: " + valor);
    }
}

