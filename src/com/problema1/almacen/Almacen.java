package com.problema1.almacen;

import com.problema1.robots.Robot;
import com.problema1.utils.GenericKiwi;

public class Almacen {
    private String nombreAlmacen;
    private GenericKiwi<Robot> colaRobots = new GenericKiwi<Robot>();

    public Almacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public void ponerEnCola(Robot roboto) {
        System.out.println("El robot " + roboto.getNombreRobot() + " llega al almacén" + "\n");
        colaRobots.enqueue(roboto);
    }

    public Robot atenderRobot() {
        Robot roboto = colaRobots.dequeue();
        System.out.println("El robot " + roboto.getNombreRobot() + " ha sido atendido con su carga. ");
        System.out.println(roboto.getCargamento());
        return roboto;
    }

    @Override
    public String toString() {
        return colaRobots.toString() + "\n";
    }
}
