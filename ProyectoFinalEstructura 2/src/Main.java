import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        UI ui = new UI();
        JFrame frame = new JFrame("UI");
        frame.setContentPane(ui.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600,300));
        frame.setVisible(true);
    }

}
