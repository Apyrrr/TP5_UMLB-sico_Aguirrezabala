package relaciones1a1;

public class Ej8_DocumentoFirmaUsuario { }

class Usuario { private String nombre, email;
    public Usuario(String nombre, String email) { this.nombre = nombre; this.email = email; } }

class FirmaDigital {
    private String codigoHash, fecha;
    private Usuario usuario;                      // agregación
    public FirmaDigital(String hash, String fecha, Usuario u) {
        this.codigoHash = hash; this.fecha = fecha; this.usuario = u;
    }
}

class Documento {
    private String titulo, contenido;
    private final FirmaDigital firma;             // composición
    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo; this.contenido = contenido; this.firma = firma;
    }
}

