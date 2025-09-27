package dependenciaUso;

public class DemosDepUso {
    public static void demo11() {
        Artista a = new Artista("Soda Stereo", "Rock");
        Cancion c = new Cancion("De Música Ligera", a);
        Reproductor r = new Reproductor();
        r.reproducir(c); // usa y no guarda
    }

    public static void demo12() {
        Contribuyente c = new Contribuyente("Carla", "20-33445566-7");
        Impuesto imp = new Impuesto(12345.67, c);
        Calculadora calc = new Calculadora();
        calc.calcular(imp); // usa y no guarda
    }
}

