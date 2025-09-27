package dependenciaCreacion;

public class DemosDepCreacion {
    public static void demo13() {
        UsuarioQR u = new UsuarioQR("Pablo", "pablo@mail.com");
        GeneradorQR g = new GeneradorQR();      // ahora accedemos desde el mismo paquete
        g.generar("VAL-QR-001", u);
    }

    public static void demo14() {
        Proyecto p = new Proyecto("Promo 2025", 2);
        EditorVideo ev = new EditorVideo();
        ev.exportar("MP4", p);
    }
}
