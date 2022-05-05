package com.problema1.robots;
import com.problema1.almacen.Producto;
import com.problema1.utils.GenericKiwi;
import com.problema1.utils.GenericStack;

public class Robot {
    private String nombreRobot;
    private int cantidadCarga;
    private GenericStack<Producto> cargamento = new GenericStack<Producto>();

    public Robot(String nombreRobot) {
        this.nombreRobot = nombreRobot;
    }

    public String getNombreRobot() {
        return nombreRobot;
    }

    public String getCargamento() {
        System.out.println("El robot " + getNombreRobot() + " ha recogido los siguientes productos: ");
        return cargamento.toString();
    }

    public static Robot crearRobot() {
        Robot robocop = new Robot(RobotUtils.generarNombreRobot());
        int carga = (int) RobotUtils.generarNumeroAleatorio(5);
        for (int i = 0; i < carga; i++) {
            robocop.anyadirProductoAleatorio();
        }
        return robocop;
    }

    public void anyadirProductoAleatorio() {
        Producto producto = Producto.generarProducto();
        cargamento.push(producto);
    }

    @Override
    public String toString() {
        return  "\n" + "Nombre: " + nombreRobot + "\n" +
                "Cantidad de carga: " + cantidadCarga + "\n" +
                "Cargamento: " + cargamento + "\n";
    }
}
