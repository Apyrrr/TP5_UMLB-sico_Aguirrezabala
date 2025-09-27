package relaciones1a1;

public class Ej3_LibroAutorEditorial { }

class Autor { private String nombre, nacionalidad;
    public Autor(String nombre, String nacionalidad) { this.nombre = nombre; this.nacionalidad = nacionalidad; } }

class Editorial { private String nombre, direccion;
    public Editorial(String nombre, String direccion) { this.nombre = nombre; this.direccion = direccion; } }

class Libro {
    private String titulo, isbn;
    private Autor autor;                           // asociación unidireccional
    private Editorial editorial;                   // agregación
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial;
    }
}
