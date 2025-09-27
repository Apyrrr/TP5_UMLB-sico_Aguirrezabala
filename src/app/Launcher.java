package app;

import java.util.Scanner;

import relaciones1a1.DemosRel1a1;
import dependenciaUso.DemosDepUso;
import dependenciaCreacion.DemosDepCreacion;

public class Launcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== TP5 – UML Relaciones ===");
            System.out.println("1) Relaciones 1 a 1 (Ej1..Ej10)");
            System.out.println("2) Dependencia de uso (Ej11..Ej12)");
            System.out.println("3) Dependencia de creación (Ej13..Ej14)");
            System.out.println("0) Salir");
            System.out.print("Elegí una opción: ");

            String in = sc.nextLine().trim();
            if (in.isEmpty()) continue;
            int op;
            try { op = Integer.parseInt(in); } catch (NumberFormatException e) { continue; }

            if (op == 1) {
                menuRelaciones1a1(sc);
            } else if (op == 2) {
                menuDependenciaUso(sc);
            } else if (op == 3) {
                menuDependenciaCreacion(sc);
            } else if (op == 0) {
                System.out.println("¡Listo!");
                return;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }

    private static void menuRelaciones1a1(Scanner sc) {
        while (true) {
            System.out.println("\n[Relaciones 1 a 1]");
            System.out.println("1) Ej1 Pasaporte-Foto-Titular (Comp + Bi)");
            System.out.println("2) Ej2 Celular-Bateria-Usuario (Agreg + Bi)");
            System.out.println("3) Ej3 Libro-Autor-Editorial (Uni + Agreg)");
            System.out.println("4) Ej4 Tarjeta-Cliente-Banco (Bi + Agreg)");
            System.out.println("5) Ej5 Computadora-Placa-Propietario (Comp + Bi)");
            System.out.println("6) Ej6 Reserva-Cliente-Mesa (Uni + Agreg)");
            System.out.println("7) Ej7 Vehiculo-Motor-Conductor (Agreg + Bi)");
            System.out.println("8) Ej8 Documento-Firma-Usuario (Comp + Agreg)");
            System.out.println("9) Ej9 CitaMedica (Uni→Paciente/Profesional)");
            System.out.println("10) Ej10 Cuenta-Clave-Titular (Comp + Bi)");
            System.out.println("0) Volver");
            System.out.print("Elegí ejercicio: ");

            String in = sc.nextLine().trim();
            if (in.isEmpty()) continue;
            int op;
            try { op = Integer.parseInt(in); } catch (NumberFormatException e) { continue; }

            if      (op == 1)  DemosRel1a1.demo1();
            else if (op == 2)  DemosRel1a1.demo2();
            else if (op == 3)  DemosRel1a1.demo3();
            else if (op == 4)  DemosRel1a1.demo4();
            else if (op == 5)  DemosRel1a1.demo5();
            else if (op == 6)  DemosRel1a1.demo6();
            else if (op == 7)  DemosRel1a1.demo7();
            else if (op == 8)  DemosRel1a1.demo8();
            else if (op == 9)  DemosRel1a1.demo9();
            else if (op == 10) DemosRel1a1.demo10();
            else if (op == 0)  return;
            else System.out.println("Opción inválida.");

            pausa(sc);
        }
    }

    private static void menuDependenciaUso(Scanner sc) {
        while (true) {
            System.out.println("\n[Dependencia de uso]");
            System.out.println("11) Ej11 Reproductor-Cancion (usa)");
            System.out.println("12) Ej12 Calculadora-Impuesto (usa)");
            System.out.println("0) Volver");
            System.out.print("Elegí ejercicio: ");

            String in = sc.nextLine().trim();
            if (in.isEmpty()) continue;
            int op;
            try { op = Integer.parseInt(in); } catch (NumberFormatException e) { continue; }

            if      (op == 11) DemosDepUso.demo11();
            else if (op == 12) DemosDepUso.demo12();
            else if (op == 0)  return;
            else System.out.println("Opción inválida.");

            pausa(sc);
        }
    }

    private static void menuDependenciaCreacion(Scanner sc) {
        while (true) {
            System.out.println("\n[Dependencia de creación]");
            System.out.println("13) Ej13 GeneradorQR (crea y no guarda)");
            System.out.println("14) Ej14 EditorVideo-Render (crea y no guarda)");
            System.out.println("0) Volver");
            System.out.print("Elegí ejercicio: ");

            String in = sc.nextLine().trim();
            if (in.isEmpty()) continue;
            int op;
            try { op = Integer.parseInt(in); } catch (NumberFormatException e) { continue; }

            if      (op == 13) DemosDepCreacion.demo13();
            else if (op == 14) DemosDepCreacion.demo14();
            else if (op == 0)  return;
            else System.out.println("Opción inválida.");

            pausa(sc);
        }
    }

    private static void pausa(Scanner sc) {
        System.out.print("\n[Enter para volver al menú] ");
        if (sc.hasNextLine()) sc.nextLine();
    }
}
