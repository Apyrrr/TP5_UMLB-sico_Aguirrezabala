package dependenciaUso;

public class Ej11_ReproductorCancion { }

class Artista { private String nombre, genero;
    public Artista(String nombre, String genero) { this.nombre = nombre; this.genero = genero; } }

class Cancion  {
    private String titulo; private Artista artista;     // asociación unidireccional
    public Cancion(String titulo, Artista artista) { this.titulo = titulo; this.artista = artista; }
    public String getTitulo(){ return titulo; }
}

class Reproductor {
    public void reproducir(Cancion c) {                 // dependencia de uso (no guarda referencia)
        System.out.println("▶ Reproduciendo: " + c.getTitulo());
    }
}

