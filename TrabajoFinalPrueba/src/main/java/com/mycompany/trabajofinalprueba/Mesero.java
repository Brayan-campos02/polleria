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
public class Mesero extends Persona {

    private int codigoMesero;
    private String turno;
    Hashtable<Integer, PedidoAsignado> pedidosAsignados = new Hashtable<Integer, PedidoAsignado>();

    public Mesero(int dni, String nombre, String fechaNacimiento, String direccion, int telefono, int codigoMesero, String turno) {
        super(dni, nombre, fechaNacimiento, direccion, telefono);
        this.codigoMesero = codigoMesero;
        this.turno = turno;
    }

    public int getCodigoMesero() {
        return codigoMesero;
    }

    public void setCodigoMesero(int codigoMesero) {
        this.codigoMesero = codigoMesero;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void asignarPedidoMesero(PedidoAsignado pedidoAsignado) {
        pedidosAsignados.put(pedidoAsignado.getCodigo(), pedidoAsignado);
    }

    @Override
    public String toString() {
        return "Mesero:"
                + "\n     codigo: " + codigoMesero
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
