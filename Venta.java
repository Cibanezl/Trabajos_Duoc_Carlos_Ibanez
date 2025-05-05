/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Iba
 */
public class Venta {
    int idVenta;
    Asiento asiento;
    Cliente cliente;
    double precio;

    public Venta(int idVenta, Asiento asiento, Cliente cliente, double precio) {
        this.idVenta = idVenta;
        this.asiento = asiento;
        this.cliente = cliente;
        this.precio = precio;
    }
}

