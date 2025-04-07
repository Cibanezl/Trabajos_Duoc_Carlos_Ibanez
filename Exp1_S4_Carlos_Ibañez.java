
package prueba;

import java.util.Scanner;

public class Exp1_S4_Carlos_Ibañez {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Menú Principal:");
            String[] opciones = {"Comprar entrada", "Salir"};
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.print("Selecciona una opción (1 o 2): ");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1: 
                    System.out.println("ubicaciones disponibles: ");
                    System.out.println("Zona A: $40000");
                    System.out.println("Zona B: $30000");
                    System.out.println("Zona C: $20000");
                    
                    System.out.println("Selecciona la zona (A, B, C): ");
                    String zona = scanner.next();
                
                    double precioBase = 0;
                    if (zona.equals("A")) {
                           precioBase = 40000;
                    } else if (zona.equals("B")) {
                        precioBase = 30000;
                    } else if (zona.equals("C")) {
                        precioBase = 20000;
                    } else {
                        System.out.println("Zona no válida. Intentando de nuevo.");
                        continue;  
                    }

                    System.out.print("Ingresa tu edad: ");
                    int edad = scanner.nextInt();
                    double descuento = 0;

                    if (edad < 18) {
                        System.out.println("No se aplican descuentos para menores de edad.");
                    } else if (edad >= 18 && edad <= 25) {
                        descuento = 0.10;
                    } else if (edad >= 65) {
                        descuento = 0.15;
                    }

                    double precioFinal = precioBase * (1 - descuento);

                    while (precioFinal <= 0) {
                        System.out.println("Precio no válido. Intentando nuevamente.");
                        precioFinal = precioBase * (1 - descuento);
                    }

                    System.out.println("\n--- Resumen de la compra ---");
                    System.out.println("Ubicación del asiento: Zona " + zona);
                    System.out.println("Precio base: $" + precioBase);
                    System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
                    System.out.println("Precio final a pagar: $" + precioFinal);               
                    
                    break;
                    
                case 2:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego");
                    break;
                   
                    
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                        
                    
            }
            if (opcion == 2 ){
                break;  
            
                
            
            }
        }
    }
    }



       
  


