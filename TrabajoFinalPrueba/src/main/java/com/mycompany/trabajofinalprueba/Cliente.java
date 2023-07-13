/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinalprueba;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author brayan campos
 */
public class Cliente extends Persona {

    private String email;
    Hashtable<Integer, Pedido> pedidos = new Hashtable<Integer, Pedido>();

    public Cliente(int dni, String nombre, String email, String fechaNacimiento, String direccion, int telefono) {
        super(dni, nombre, fechaNacimiento, direccion, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Hashtable<Integer, Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Hashtable<Integer, Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.put(pedido.getCodigo(), pedido);
    }

    public Pedido buscarPedido(int codigo) {
        return pedidos.get(codigo);
    }

    
    public double calcularTotalPedidos() {
        double total = 0.0;
        Enumeration<Pedido> enu = pedidos.elements();
        while (enu.hasMoreElements()) {
            Pedido pedido = enu.nextElement();
            total += pedido.obtenerPrecioProducto();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente:"
                + "\n     dni: " + dni
                + "\n     nombre: " + nombre
                + "\n     email: " + email
                + "\n     fechaNacimiento: " + fechaNacimiento
                + "\n     Direccion: " + direccion
                + "\n     telefono: " + telefono;
    }

    public String obtenerDatosDePedidos() {
        Pedido p;
        String dx = "";
        Enumeration<Pedido> enu = pedidos.elements();
        while (enu.hasMoreElements()) {
            p = enu.nextElement();
            dx = dx + p.toString() + "\n";
        }
        return dx;
    }
}
