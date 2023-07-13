/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinalprueba;

/**
 *
 * @author brayan campos
 */
public class PedidoAsignado extends Pedido{
    private String horario;
    private String estado;

    public PedidoAsignado(String horario, String estado, int codigo, int codigoProducto, String tipo) {
        super(codigo, codigoProducto, tipo);
        this.horario = horario;
        this.estado = estado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PedidoAsignado ("+codigo+"):" 
                + "\n   codigo = " + codigo 
                + "\n   horario = " + horario 
                + "\n   estado = " + estado;
    }
    
    
}
