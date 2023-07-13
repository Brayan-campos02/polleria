/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinalprueba;

/**
 *
 * @author brayan campos
 */
public class Pedido {

    protected int codigo;
    protected int codigoProducto;
    protected String tipo;

    public Pedido(int codigo, int codigoProducto, String tipo) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerPrecioProducto() {
        double precioProducto = 0.0;

        if (codigoProducto == 1001) {
            precioProducto = 18.00;
        } else if (codigoProducto == 1002) {
            precioProducto = 24.00;
        } else if (codigoProducto == 1003) {
            precioProducto = 41.00;
        } else if (codigoProducto == 1004) {
            precioProducto = 47.00;
        } else if (codigoProducto == 1005) {
            precioProducto = 61.00;
        } else if (codigoProducto == 1006) {
            precioProducto = 20.00;
        } else if (codigoProducto == 1007) {
            precioProducto = 22.50;
        } else if (codigoProducto == 1008) {
            precioProducto = 11.00;
        } else if (codigoProducto == 1009) {
            precioProducto = 13.50;
        } else if (codigoProducto == 1010) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1011) {
            precioProducto = 16.50;
        } else if (codigoProducto == 1012) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1013) {
            precioProducto = 15.50;
        } else if (codigoProducto == 1014) {
            precioProducto = 15.50;
        } else if (codigoProducto == 1015) {
            precioProducto = 15.50;
        } else if (codigoProducto == 1016) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1017) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1018) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1019) {
            precioProducto = 7.50;
        } else if (codigoProducto == 1020) {
            precioProducto = 14.00;
        } else if (codigoProducto == 1021) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1022) {
            precioProducto = 5.50;
        } else if (codigoProducto == 1023) {
            precioProducto = 8.50;
        } else if (codigoProducto == 1024) {
            precioProducto = 10.50;
        } else if (codigoProducto == 1025) {
            precioProducto = 5.50;
        } else if (codigoProducto == 1026) {
            precioProducto = 8.50;
        } else if (codigoProducto == 1027) {
            precioProducto = 10.50;
        } else if (codigoProducto == 1028) {
            precioProducto = 14.50;
        } else if (codigoProducto == 1029) {
            precioProducto = 16.50;
        } else if (codigoProducto == 1030) {
            precioProducto = 34.00;
        } else if (codigoProducto == 1031) {
            precioProducto = 36.50;
        } else if (codigoProducto == 1032) {
            precioProducto = 38.50;
        } else if (codigoProducto == 1033) {
            precioProducto = 36.00;
        } else if (codigoProducto == 1034) {
            precioProducto = 32.00;
        }

        return precioProducto;
    }

    @Override
    public String toString() {
        String nombreProducto = "";
        double precioProducto = 0.0;

        if (codigoProducto == 1001) {
            nombreProducto = "1 Pollo mediano solo";
            precioProducto = 18.00;
        } else if (codigoProducto == 1002) {
            nombreProducto = "1 Pollo grande solo";
            precioProducto = 24.00;
        } else if (codigoProducto == 1003) {
            nombreProducto = "1(1/4) Pollo + papas + ensaladas";
            precioProducto = 41.00;
        } else if (codigoProducto == 1004) {
            nombreProducto = "1(1/2) Pollo + papas + ensaladas";
            precioProducto = 47.00;
        } else if (codigoProducto == 1005) {
            nombreProducto = "2 Pollos + papas + ensaladas";
            precioProducto = 61.00;
        } else if (codigoProducto == 1006) {
            nombreProducto = "1/2 Pollo + papas + ensaladas";
            precioProducto = 20.00;
        } else if (codigoProducto == 1007) {
            nombreProducto = "1/2 Pollo + papas + ensaladas + Gas.410ml";
            precioProducto = 22.50;
        } else if (codigoProducto == 1008) {
            nombreProducto = "1/4 Pollo + papas + ensaladas";
            precioProducto = 11.00;
        } else if (codigoProducto == 1009) {
            nombreProducto = "1/4 Pollo + papas + ensaladas + Gas.410ml";
            precioProducto = 13.50;
        } else if (codigoProducto == 1010) {
            nombreProducto = "Filete de Pierna al Corralito";
            precioProducto = 14.50;
        } else if (codigoProducto == 1011) {
            nombreProducto = "Filete de Pierna al Oregano";
            precioProducto = 16.50;
        } else if (codigoProducto == 1012) {
            nombreProducto = "Filete de Pierna al Limon";
            precioProducto = 14.50;
        } else if (codigoProducto == 1013) {
            nombreProducto = "Pechuga al Corralito";
            precioProducto = 15.50;
        } else if (codigoProducto == 1014) {
            nombreProducto = "Pechuga al Oregano";
            precioProducto = 15.50;
        } else if (codigoProducto == 1015) {
            nombreProducto = "Pechuga al Limon";
            precioProducto = 15.50;
        } else if (codigoProducto == 1016) {
            nombreProducto = "1/2 Porción de Anticuchos";
            precioProducto = 14.50;
        } else if (codigoProducto == 1017) {
            nombreProducto = "1 Porción de Anticuchos";
            precioProducto = 14.50;
        } else if (codigoProducto == 1018) {
            nombreProducto = "2 Porciones de Anticuchos";
            precioProducto = 14.50;
        } else if (codigoProducto == 1019) {
            nombreProducto = "1/2 Porción de Ensalada";
            precioProducto = 7.50;
        } else if (codigoProducto == 1020) {
            nombreProducto = "1 Porción de Ensalada";
            precioProducto = 14.00;
        } else if (codigoProducto == 1021) {
            nombreProducto = "2 Porciones de Ensalada";
            precioProducto = 14.50;
        } else if (codigoProducto == 1022) {
            nombreProducto = "1 Botella de Gaseosa 0.5L";
            precioProducto = 5.50;
        } else if (codigoProducto == 1023) {
            nombreProducto = "1 Botella de Gaseosa 1L";
            precioProducto = 8.50;
        } else if (codigoProducto == 1024) {
            nombreProducto = "1 Botella de Gaseosa 2L";
            precioProducto = 10.50;
        } else if (codigoProducto == 1025) {
            nombreProducto = "1 Botella de Chicha/Limonada 0.5L";
            precioProducto = 5.50;
        } else if (codigoProducto == 1026) {
            nombreProducto = "1 Botella de Chicha/Limonada 1L";
            precioProducto = 8.50;
        } else if (codigoProducto == 1027) {
            nombreProducto = "1 Botella de Chicha/Limonada 2L";
            precioProducto = 10.50;
        } else if (codigoProducto == 1028) {
            nombreProducto = "1 Botella de Vino";
            precioProducto = 14.50;
        } else if (codigoProducto == 1029) {
            nombreProducto = "1 Botella de Sangría 2L";
            precioProducto = 16.50;
        } else if (codigoProducto == 1030) {
            nombreProducto = "1 Pollo + papas + ensaladas";
            precioProducto = 34.00;
        } else if (codigoProducto == 1031) {
            nombreProducto = "1 Pollo + papas + ensaladas + 1L Gas.";
            precioProducto = 36.50;
        } else if (codigoProducto == 1032) {
            nombreProducto = "1 Pollo + papas + ensaladas + 1.5L Gas.";
            precioProducto = 38.50;
        } else if (codigoProducto == 1033) {
            nombreProducto = "1/4 Pollo + papas + ensaladas + Anticucho de Res";
            precioProducto = 36.00;
        } else if (codigoProducto == 1034) {
            nombreProducto = "1/4 Pollo + papas + ensaladas + Anticucho de pollo";
            precioProducto = 32.00;
        }

        return "Pedido (" + codigo + "):\n"
                + "     Código del Producto = " + codigoProducto + "\n"
                + "     Nombre = " + nombreProducto + "\n"
                + "     Precio = S/" + precioProducto + "\n"
                + "     Tipo de entrega = " + tipo;
    }

}
