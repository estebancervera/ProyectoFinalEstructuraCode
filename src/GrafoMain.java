import javax.swing.*;
import java.awt.*;

public class GrafoMain {
    public static void main() {

        JFrame ventana = new JFrame("GRAFOS");
        JFrame menu = new JFrame("Menu Grafos");

        GrafoCanvas grafoCanvas = new GrafoCanvas();
        ventana.add(grafoCanvas);
        menu.add(new SideMenu(grafoCanvas));

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();

        menu.setSize(600,600);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.pack();




        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();

        int x = (int) rect.getMaxX()/2 - ventana.getWidth()/2;
        int y = (int) rect.getMaxY()/2 - ventana.getHeight()/2;
        ventana.setLocation(x, y);
        ventana.setVisible(true);
        menu.setLocation(x + ventana.getWidth(), y);
        menu.setVisible(true);
    }



}
