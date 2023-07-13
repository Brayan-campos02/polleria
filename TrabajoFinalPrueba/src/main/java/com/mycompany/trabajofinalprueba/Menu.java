/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinalprueba;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan campos
 */
public class Menu {

    public void mostrarMenu() {

        String menuComida = """
            MENU
        1. Pollos a la Brasa
        2. Pechugas
        3. Anticuchos
        4. Ensaladas
        5. Bebidas
        6. Cocteles
        7. Promociones
        8. Salir
        """;

        int opcion = 0;
        int n = 12;

        while (opcion != n) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menuComida));
            //Precios son solo de referencia, se cambiará luego
            switch (opcion) {
                case 1 ->
                    JOptionPane.showMessageDialog(null, """
                  Pollos a la Brasa
                
            1 Pollo mediano solo S/18.00  |  codigo: 1001
            1 Pollo grande solo S/24.00  |  codigo: 1002
                        
            1(1/4) Pollo + papas + ensaladas S/41.00  |  codigo: 1003
            1(1/2) Pollo + papas + ensaladas S/47.00  |  codigo: 1004
            2 Pollos + papas + ensaladas S/61.00  |  codigo: 1005
                        
            1/2 Pollo + papas + ensaladas S/20.00  |  codigo: 1006
            1/2 Pollo + papas + ensaladas + Gas.410ml S/22.50  |  codigo: 1007
            1/4 Pollo + papas + ensaladas S/11.00  |  codigo: 1008
            1/4 Pollo + papas + ensaladas + Gas.410ml S/13.50  |  codigo: 1009
                        
            """);
                case 2 ->
                    JOptionPane.showMessageDialog(null, """
                  Pechugas
                  
            Filete de Pierna al Corralito S/14.50   |  codigo: 1010
            Filete de Pierna al Oregano S/16.50  |  codigo: 1011
            Filete de Pierna al Limon S/14.50  |  codigo: 1012
                        
            Pechuga al Corralito S/15.50  |  codigo: 1013
            Pechuga al Oregano S/15.50  |  codigo: 1014
            Pechuga al Limon S/15.50  |  codigo: 1015
            """);
                case 3 ->
                    JOptionPane.showMessageDialog(null, """
                  Anticuchos
                  
                1/2 Porción de Anticuchos S/14.50  |  codigo: 1016
            1 Porción de Anticuchos S/14.50  |  codigo: 1017
            2 Porciones de Anticuchos S/14.50  |  codigo: 1018
            """);
                case 4 ->
                    JOptionPane.showMessageDialog(null, """
                  Ensaladas
                  
            1/2 Porción de Ensalada S/7.50  |  codigo: 1019
            1 Porción de Ensalada S/14.00  |  codigo: 1020
            2 Porciones de Ensalada S/14.50  |  codigo: 1021
            """);
                case 5 ->
                    JOptionPane.showMessageDialog(null, """
                  Bebidas
                  
            1 Botella de Gaseosa 0.5L S/5.50  |  codigo: 1022
            1 Botella de Gaseosa 1L S/8.50  |  codigo: 1023
            1 Botella de Gaseosa 2L S/10.50  |  codigo: 1024
                        
            1 Botella de Chicha/Limonada 0.5L S/5.50  |  codigo: 1025
            1 Botella de Chicha/Limonada 1L S/8.50  |  codigo: 1026
            1 Botella de Chicha/Limonada 2L S/10.50  |  codigo: 1027
            """);
                case 6 ->
                    JOptionPane.showMessageDialog(null, """
                  Cocteles
                  
            1 Botella de Vino S/14.50  |  codigo: 1028
            1 Botella de Sangría 2L S/16.50  |  codigo: 1029
            """);
                case 7 ->
                    JOptionPane.showMessageDialog(null, """
                  Promociones
                  
            1 Pollo + papas + ensaladas S/34.00  |  codigo: 1030
            1 Pollo + papas + ensaladas + 1L Gas. S/36.50  |  codigo: 1031
            1 Pollo + papas + ensaladas + 1.5L Gas. S/38.50  |  codigo: 1032
                        
            1/4 Pollo + papas + ensaladas + Anticucho de Res S/36.00  |  codigo: 1033
            1/4 Pollo + papas + ensaladas + Anticucho de pollo S/32.00  |  codigo: 1034
            """);
                case 8 ->
                    opcion = n;
                default ->
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }
        }
    }
}
