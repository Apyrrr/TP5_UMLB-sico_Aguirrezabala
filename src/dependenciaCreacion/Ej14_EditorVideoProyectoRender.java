package dependenciaCreacion;

public class Ej14_EditorVideoProyectoRender { }

class Proyecto {
    private String nombre; private int duracionMin;
    public Proyecto(String nombre, int duracionMin) { this.nombre = nombre; this.duracionMin = duracionMin; }
    public String getNombre(){ return nombre; }
}

class Render {
    private String formato; private Proyecto proyecto;    // asociación unidireccional
    public Render(String formato, Proyecto proyecto) { this.formato = formato; this.proyecto = proyecto; }
}

class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) { // dependencia de creación (no guarda)
        Render r = new Render(formato, proyecto);
        System.out.println("Exportado " + proyecto.getNombre() + " en " + formato);
    }
}

