package com.problema1.almacen;

import com.problema1.robots.RobotUtils;

public class Producto {
    private final static int PRECIO_MAXIMO = 20000;
    private final static int CANTIDAD_MAXIMA = 3;

    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public static Producto generarProducto() {
        String nombre = RobotUtils.generarNombreProducto();
        float precio = (float) RobotUtils.generarNumeroAleatorio(PRECIO_MAXIMO);
        int cantidad = (int) RobotUtils.generarNumeroAleatorio(CANTIDAD_MAXIMA);
        return new Producto(nombre, precio, cantidad);
    }

    @Override
    public String toString() {
        return "\n" + "Nombre: " + nombre + "\n" +
               "Precio: " + precio + "€\n" +
               "Cantidad Producto: " + cantidad + "\n";
    }
}
