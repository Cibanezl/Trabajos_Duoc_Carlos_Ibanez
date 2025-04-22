
package teatromoro;

/**
 *
 * @author Carlos Iba
 */
import java.util.Scanner;

public class TeatroMoro {
    // Variables de instancia
    private int entradasVendidas = 0;
    private double ingresosTotales = 0.0;
    private final double PRECIO_ENTRADA = 10.0;

    // Variables estáticas
    private static int totalEntradasVendidas = 0;
    private static double totalIngresos = 0.0;

    public static void main(String[] args) {
        TeatroMoro teatro = new TeatroMoro();
        teatro.mostrarMenu();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Venta de Entradas ---");
            System.out.println("1. Reservar Entradas");
            System.out.println("2. Comprar Entradas");
            System.out.println("3. Modificar Venta");
            System.out.println("4. Imprimir Boleto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    reservarEntradas();
                    break;
                case 2:
                    comprarEntradas();
                    break;
                case 3:
                    modificarVenta();
                    break;
                case 4:
                    imprimirBoleto();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private void reservarEntradas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de entradas a reservar: ");
        int cantidad = scanner.nextInt();

        if (cantidad > 0) {
            System.out.println("Entradas reservadas: " + cantidad);
            // Puntos de depuración
            System.out.println("[DEBUG] Reserva realizada con éxito.");
        } else {
            System.out.println("Cantidad no válida.");
        }
    }

    private void comprarEntradas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de entradas a comprar: ");
        int cantidad = scanner.nextInt();

        if (cantidad > 0) {
            double total = cantidad * PRECIO_ENTRADA;
            entradasVendidas += cantidad;
            totalEntradasVendidas += cantidad;
            ingresosTotales += total;
            totalIngresos += total;
            System.out.println("Compra realizada. Total a pagar: $" + total);
            // Puntos de depuración
            System.out.println("[DEBUG] Compra realizada con éxito.");
        } else {
            System.out.println("Cantidad no válida.");
        }
    }

    private void modificarVenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de la venta a modificar: ");
        int numeroVenta = scanner.nextInt();

        
        System.out.println("Venta " + numeroVenta + " modificada.");
        
        System.out.println("[DEBUG] Venta modificada con éxito.");
    }

    private void imprimirBoleto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de la venta para imprimir el boleto: ");
        int numeroVenta = scanner.nextInt();

        
        System.out.println("Boleto para la venta " + numeroVenta + " impreso.");
        
        System.out.println("[DEBUG] Boleto impreso con éxito.");
    }
}