import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
        menu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menu.pack();

        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // call terminate
                menu.dispatchEvent(new WindowEvent(menu, WindowEvent.WINDOW_CLOSING));
            }
        });

        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.pack();

        int x = (int) rect.getMaxX()/2 - ventana.getWidth()/2;
        int y = (int) rect.getMaxY()/2 - ventana.getHeight()/2;
        ventana.setLocation(x, y);
        ventana.setVisible(true);
        menu.setLocation(x + ventana.getWidth(), y);
        menu.setVisible(true);



    }



}
