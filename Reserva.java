/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Iba
 */
public class Reserva {
    int idReserva;
    Cliente cliente;
    Asiento asiento;

    public Reserva(int idReserva, Cliente cliente, Asiento asiento) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.asiento = asiento;
    }
}

