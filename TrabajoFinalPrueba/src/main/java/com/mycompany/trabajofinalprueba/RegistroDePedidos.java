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
public class RegistroDePedidos {
    Hashtable<Integer,Pedido> pedidos = new Hashtable<Integer, Pedido>();

     
    public Pedido buscarPedido(int codigo){
        return pedidos.get(codigo);
    }
     
    public void registrarPedidos(Pedido pedido){
        pedidos.put(pedido.getCodigo(), pedido);
    }
     
    public String obtenerDatosDePedidos(){
        Pedido p;
        String dx="";
        Enumeration <Pedido> enu = pedidos.elements();
        while(enu.hasMoreElements()){
            p=enu.nextElement();
            dx=dx+p.toString()+"\n";
        }
        return dx;
    }
}
