import com.problema1.almacen.Almacen;
import com.problema1.robots.Robot;

public class Main {
    public static void main(String[] args) {

        final int NUMERO_ROBOTS = 5;

        Almacen almacen = new Almacen("Moichysen");

        System.out.println("");

        for (int i = 0; i < NUMERO_ROBOTS; i++) {
            Robot robocopDeMentira = Robot.crearRobot();
            almacen.ponerEnCola(robocopDeMentira);
        }

        for (int i = 0; i < NUMERO_ROBOTS; i++) {
            Robot robotAtendido = almacen.atenderRobot();
        }



    }



}
