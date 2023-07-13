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
public class RegistroDePersonas {
  Hashtable<Integer, Persona> personas = new Hashtable<Integer, Persona>();

  public Persona buscarPersona(int dni) {
    return personas.get(dni);
  }

  public void registrarPersona(Persona persona) {
    personas.put(persona.getDni(), persona);
  }

  public String obtenerDatosDePersonas() {
    Persona p;
    String dx = "";
    Enumeration<Persona> enu = personas.elements();
    while (enu.hasMoreElements()) {
      p = enu.nextElement();
      dx = dx + p.toString() + "\n";
    }
    return dx;
  }
}
