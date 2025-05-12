
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Teatro     {
    List<Entrada> zonas;
    int totalVentas = 0;

    public Teatro() {
        zonas = new ArrayList<>();
        zonas.add(new Entrada("VIP", 20000, 5));
        zonas.add(new Entrada("Palco", 18000, 5));
        zonas.add(new Entrada("Platea Alta", 15000, 5));
        zonas.add(new Entrada("Platea Baja", 12000, 5));
        zonas.add(new Entrada("General", 8000, 5));
    }

    public void mostrarZonas() {
        for (int i = 0; i < zonas.size(); i++) {
            Entrada e = zonas.get(i);
            System.out.println((i + 1) + ". " + e.zona + " - $" + e.precio + " - Disponibles: " + e.disponibles());
            e.mostrarAsientos();
        }
    }

    public void comprar(Scanner sc) {
        mostrarZonas();
        int opcionZona = leerEntero(sc, "Seleccione la zona (1-" + zonas.size() + "): ", 1, zonas.size());
        Entrada entradaSeleccionada = zonas.get(opcionZona - 1);

        System.out.println("Cantidad de entradas a comprar (máx " + entradaSeleccionada.disponibles() + "):");
        int cantidad = leerEntero(sc, "> ", 1, entradaSeleccionada.disponibles());

        boolean esTerceraEdad = leerBooleano(sc, "¿Es tercera edad? (s/n): ");
        boolean esMujer = leerBooleano(sc, "¿Es mujer? (s/n): ");
        boolean esEstudiante = leerBooleano(sc, "¿Es estudiante? (s/n): ");
        boolean esNino = leerBooleano(sc, "¿Es niño? (s/n): ");

        Cliente cliente = new Cliente(esTerceraEdad, esMujer, esEstudiante, esNino);
        double descuento = cliente.obtenerDescuento();

        List<Integer> asientosComprados = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            entradaSeleccionada.mostrarAsientos();
            int asiento = leerEntero(sc, "Seleccione el asiento " + (i + 1) + ": ", 1, entradaSeleccionada.asientos.length);
            while (!entradaSeleccionada.comprarAsiento(asiento - 1)) {
                System.out.println("Asiento no disponible. Intente otro.");
                asiento = leerEntero(sc, "Seleccione el asiento " + (i + 1) + ": ", 1, entradaSeleccionada.asientos.length);
            }
            asientosComprados.add(asiento);
        }

        int precioSinDescuento = entradaSeleccionada.precio * cantidad;
        double montoDescuento = precioSinDescuento * descuento;
        double total = precioSinDescuento - montoDescuento;

        totalVentas += total;

        System.out.println("\n--- BOLETA ---");
        System.out.println("Zona: " + entradaSeleccionada.zona);
        System.out.println("Asientos: " + asientosComprados);
        System.out.println("Precio unitario: $" + entradaSeleccionada.precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Total a pagar: $" + total);
        System.out.println("---------------\n");
    }

    public void verVentas() {
        System.out.println("Total recaudado: $" + totalVentas);
    }

    private int leerEntero(Scanner sc, String mensaje, int min, int max) {
        String entrada;
        int valor;
        do {
            System.out.print(mensaje);
            entrada = sc.nextLine();
        } while (!esEnteroValido(entrada, min, max));
        return Integer.parseInt(entrada);
    }

    private boolean esEnteroValido(String entrada, int min, int max) {
        if (!entrada.matches("\\d+")) return false;
        int valor = Integer.parseInt(entrada);
        return valor >= min && valor <= max;
    }

    private boolean leerBooleano(Scanner sc, String mensaje) {
        String entrada;
        do {
            System.out.print(mensaje);
            entrada = sc.nextLine().trim().toLowerCase();
        } while (!entrada.equals("s") && !entrada.equals("n"));
        return entrada.equals("s");
    }
}
