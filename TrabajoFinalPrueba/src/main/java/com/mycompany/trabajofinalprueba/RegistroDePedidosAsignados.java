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
public class RegistroDePedidosAsignados {
    Hashtable<Integer,PedidoAsignado> pedidosAsignados = new Hashtable<Integer, PedidoAsignado>();

     
    public PedidoAsignado buscarPedidoAsignado(int codigo){
        return pedidosAsignados.get(codigo);
    }
     
    public void registrarPedidosAsignados(PedidoAsignado pedidoAsignado){
        pedidosAsignados.put(pedidoAsignado.getCodigo(), pedidoAsignado);
    }
    
    public String obtenerDatosDePedidosAsignados(){
        PedidoAsignado p;
        String dx="";
        if (pedidosAsignados.isEmpty()) {
                         return "No hay pedidos asignados";}
        Enumeration <PedidoAsignado> enu = pedidosAsignados.elements();
        while(enu.hasMoreElements()){
            p=enu.nextElement();
            dx=dx+p.toString()+"\n";
        }
        return dx;
    }
}
