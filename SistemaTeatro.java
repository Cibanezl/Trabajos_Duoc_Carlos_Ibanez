/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Iba
 */
import java.util.ArrayList;

public class SistemaTeatro {

    // Listas que gestionan ventas, asientos y clientes
    Asiento[] asientos;
    ArrayList<Venta> ventas;
    ArrayList<Reserva> reservas;
    ArrayList<Cliente> clientes;

    // Constructor
    public SistemaTeatro(int numAsientos) {
        asientos = new Asiento[numAsientos];
        ventas = new ArrayList<>();
        reservas = new ArrayList<>();
        clientes = new ArrayList<>();

        // Inicializando asientos
        for (int i = 0; i < numAsientos; i++) {
            asientos[i] = new Asiento(i + 1);
        }
    }

    // Método para vender una entrada
    public boolean venderEntrada(int idCliente, int idAsiento) {
        Cliente cliente = buscarCliente(idCliente);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return false;
        }

        Asiento asiento = buscarAsiento(idAsiento);
        if (asiento == null || !asiento.disponible) {
            System.out.println("Asiento no disponible.");
            return false;
        }

        // Aplicar descuentos
        double precio = 100.0; // Precio base
        if (cliente.tipo.equals("Estudiante")) {
            precio -= precio * 0.10; // 10% descuento para estudiantes
        } else if (cliente.tipo.equals("Tercera Edad")) {
            precio -= precio * 0.15; // 15% descuento para tercera edad
        }

        // Registrar la venta
        Venta venta = new Venta(ventas.size() + 1, asiento, cliente, precio);
        ventas.add(venta);
        asiento.disponible = false; // Marcar el asiento como vendido
        System.out.println("Venta realizada exitosamente.");
        return true;
    }

    // Método para buscar un cliente
    private Cliente buscarCliente(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.idCliente == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    // Método para buscar un asiento
    private Asiento buscarAsiento(int idAsiento) {
        if (idAsiento > 0 && idAsiento <= asientos.length) {
            return asientos[idAsiento - 1];
        }
        return null;
    }

    // Método de validación de entrada para la venta
    public boolean validarVenta(int idCliente, int idAsiento) {
        Cliente cliente = buscarCliente(idCliente);
        Asiento asiento = buscarAsiento(idAsiento);

        if (cliente == null) {
            System.out.println("Cliente no válido.");
            return false;
        }
        if (asiento == null || !asiento.disponible) {
            System.out.println("Asiento no disponible.");
            return false;
        }
        return true;
    }
}

