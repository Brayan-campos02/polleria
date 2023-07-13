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
public class Repartidor extends Persona {

    private int codigoRepartidor;
    private String turno;
    private Pedido pedidoAsignado;
    Hashtable<Integer, PedidoAsignado> pedidosAsignados = new Hashtable<Integer, PedidoAsignado>();

    public Repartidor(int dni, String nombre, String fechaNacimiento, String direccion, int telefono, int codigoRepartidor, String turno) {
        super(dni, nombre, fechaNacimiento, direccion, telefono);
        this.codigoRepartidor = codigoRepartidor;
        this.turno = turno;
        this.pedidoAsignado = null;
    }

    public int getCodigoRepartidor() {
        return codigoRepartidor;
    }

    public void setCodigoRepartidor(int codigoRepartidor) {
        this.codigoRepartidor = codigoRepartidor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Pedido getPedidoAsignado() {
        return pedidoAsignado;
    }

    public void asignarPedido(Pedido pedido) {
        this.pedidoAsignado = pedido;
    }

    public void asignarPedidoRepartidor(PedidoAsignado pedidoAsignado) {
        pedidosAsignados.put(pedidoAsignado.getCodigo(), pedidoAsignado);
    }

    @Override
    public String toString() {
        return "Repartidor:"
                + "\n     codigo: " + codigoRepartidor
                + "\n     dni: " + dni
                + "\n     nombre: " + nombre
                + "\n     fechaNacimiento: " + fechaNacimiento
                + "\n     Direccion: " + direccion
                + "\n     telefono: " + telefono;
    }

    public String obtenerDatosDePedidosAsignados() {
        PedidoAsignado p;
        String dx = "";
        Enumeration<PedidoAsignado> enu = pedidosAsignados.elements();
        while (enu.hasMoreElements()) {
            p = enu.nextElement();
            dx = dx + p.toString() + "\n";
        }
        return dx;
    }

}
