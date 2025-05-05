/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Iba
 */
public class Main {
    public static void main(String[] args) {
        // Crear el sistema de teatro con 10 asientos
        SistemaTeatro teatro = new SistemaTeatro(10);

        // Crear algunos clientes
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "Estudiante");
        Cliente cliente2 = new Cliente(2, "María García", "Tercera Edad");

        // Agregar clientes al sistema
        teatro.clientes.add(cliente1);
        teatro.clientes.add(cliente2);

        // Probar la venta de entradas
        teatro.venderEntrada(1, 3); // Cliente 1 compra el asiento 3
        teatro.venderEntrada(2, 5); // Cliente 2 compra el asiento 5

        // Intentar vender un asiento ya ocupado
        teatro.venderEntrada(1, 3); // Debe fallar porque el asiento 3 ya fue vendido
    }
}

