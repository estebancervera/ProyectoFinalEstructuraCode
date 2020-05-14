import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();


        UI ui = new UI();
        JFrame frame = new JFrame("UI");
        frame.setContentPane(ui.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(new Dimension(600,300));


        int x = (int) rect.getMaxX()/2 - frame.getWidth()/2;
        int y = (int) rect.getMaxY()/2 - frame.getHeight()/2;
        frame.setLocation(x, y);

        frame.setVisible(true);

    }

}
