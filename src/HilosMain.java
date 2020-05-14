import javax.swing.*;
import java.io.IOException;

public class HilosMain {


    public static void main() {

//        Hilo hilo1 = new Hilo(15.0, "Rojo");
//        Hilo hilo2 = new Hilo(13.0, "Azul");
//        Hilo hilo3 = new Hilo(16.0, "Amarillo");
//        Hilo hilo4 = new Hilo(12.0, "Verde");
//
//        hilo1.start();
//        hilo2.start();
//        hilo3.start();
//        hilo4.start();

        JOptionPane.showMessageDialog(null, "Abriendo el programa..." );



        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java -jar Hilos.jar\"");

        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al intentar abrir el programa. Intente de nuevo." );
        }

    }

//    private static void desincronizados(Hilo hilo1, Hilo hilo2,Hilo hilo3, Hilo hilo4){
//        outer:
//        while (true) {
//            if (!hilo1.isAlive()) {
//                hilo2.start();
//                while (true) {
//                    if (!hilo2.isAlive()) {
//                        hilo3.start();
//                        while (true) {
//                            if (!hilo3.isAlive()) {
//                                hilo4.start();
//                                while (true) {
//                                    if (!hilo4.isAlive()) {
//                                        break outer;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//
//
//            }
//        }
//    }
}



