package relaciones1a1;

public class DemosRel1a1 {
    public static void demo1() {
        Titular t = new Titular("Ana", "12345678");
        Pasaporte p = new Pasaporte("AR-2025", "01/01/2025", t, "imagen.jpg", "jpg");
        System.out.println("OK: Pasaporte con Foto (composición) y Titular (bi). Titular: " + t.getNombre());
    }

    public static void demo2() {
        Bateria b = new Bateria("BT-1000", 5000);
        UsuarioCel u = new UsuarioCel("Pepe", "44555666");
        Celular c = new Celular("IMEI-XYZ", "Acme", "Z1", b, u);
        System.out.println("OK: Celular ↔ UsuarioCel (bi) y o--- Bateria (agregación).");
    }

    public static void demo3() {
        Autor a = new Autor("Cortázar", "Argentina");
        Editorial ed = new Editorial("Alfaguara", "CABA");
        Libro l = new Libro("Rayuela", "ISBN-123", a, ed);
        System.out.println("OK: Libro → Autor (uni) y o--- Editorial (agregación).");
    }

    public static void demo4() {
        Cliente cli = new Cliente("Lucía", "40111222");
        Banco b = new Banco("Banco Ficticio", "30-11223344-9");
        TarjetaDeCredito tdc = new TarjetaDeCredito("1234-5678", "12/30", cli, b);
        System.out.println("OK: Tarjeta ↔ Cliente (bi) y o--- Banco (agregación).");
    }

    public static void demo5() {
        Propietario p = new Propietario("Marta", "38999111");
        Computadora comp = new Computadora("ACME", "SN-77", "X570", "AM4", p);
        System.out.println("OK: Computadora *--- Placa (composición) y ↔ Propietario (bi).");
    }

    public static void demo6() {
        ClienteR cr = new ClienteR("Juan", "111-222");
        Mesa m = new Mesa(7, 4);
        Reserva r = new Reserva("2025-09-26", "20:00", cr, m);
        System.out.println("OK: Reserva → Cliente (uni) y o--- Mesa (agregación).");
    }

    public static void demo7() {
        Motor mot = new Motor("Nafta", "NS-001");
        Conductor cond = new Conductor("Rosa", "B1234");
        Vehiculo v = new Vehiculo("ABC123", "Hatch", mot, cond);
        System.out.println("OK: Vehiculo o--- Motor (agregación) y ↔ Conductor (bi).");
    }

    public static void demo8() {
        Usuario us = new Usuario("Santi", "santi@mail.com");
        FirmaDigital fd = new FirmaDigital("HASH-001", "2025-09-26", us);
        Documento d = new Documento("Contrato", "Lorem ipsum...", fd);
        System.out.println("OK: Documento *--- Firma (composición) y Firma o--- Usuario (agregación).");
    }

    public static void demo9() {
        Paciente p = new Paciente("Ana", "OSDE");
        Profesional pr = new Profesional("Dra. López", "Clínica");
        CitaMedica cm = new CitaMedica("2025-09-27", "09:00", p, pr);
        System.out.println("OK: Cita → Paciente (uni) y → Profesional (uni).");
    }

    public static void demo10() {
        TitularCB t = new TitularCB("Esteban", "32123456");
        CuentaBancaria cb = new CuentaBancaria("CBU-001", 1000.0, "ABCD", "2025-09-26", t);
        System.out.println("OK: Cuenta *--- Clave (composición) y ↔ Titular (bi).");
    }
}
