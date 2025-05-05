/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Iba
 */
public class Asiento {
    int id;
    boolean disponible; // Indica si el asiento está disponible para la venta o está reservado

    public Asiento(int id) {
        this.id = id;
        this.disponible = true; // Inicialmente todos los asientos están disponibles
    }
}

