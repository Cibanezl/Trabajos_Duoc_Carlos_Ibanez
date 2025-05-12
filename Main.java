
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teatro teatro = new Teatro();

        while (true) {
            System.out.println("=== TEATRO  ===");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Ver ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = sc.nextLine();

            if (opcion.equals("1")) {
                teatro.comprar(sc);
            } else if (opcion.equals("2")) {
                teatro.verVentas();
            } else if (opcion.equals("3")) {
                System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
} 
