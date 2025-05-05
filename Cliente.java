/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Iba
 */
public class Cliente {
    int idCliente;
    String nombre;
    String tipo; // "Estudiante", "Tercera Edad", "Normal"

    public Cliente(int idCliente, String nombre, String tipo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.tipo = tipo;
    }
}

