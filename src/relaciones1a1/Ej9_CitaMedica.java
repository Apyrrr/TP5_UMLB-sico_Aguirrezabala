package relaciones1a1;

public class Ej9_CitaMedica { }

class Paciente { private String nombre, obraSocial;
    public Paciente(String nombre, String obraSocial) { this.nombre = nombre; this.obraSocial = obraSocial; } }

class Profesional { private String nombre, especialidad;
    public Profesional(String nombre, String especialidad) { this.nombre = nombre; this.especialidad = especialidad; } }

class CitaMedica {
    private String fecha, hora;
    private Paciente paciente;                    // asociación unidireccional
    private Profesional profesional;              // asociación unidireccional
    public CitaMedica(String fecha, String hora, Paciente p, Profesional pr) {
        this.fecha = fecha; this.hora = hora; this.paciente = p; this.profesional = pr;
    }
}

