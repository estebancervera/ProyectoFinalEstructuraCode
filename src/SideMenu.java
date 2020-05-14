import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMenu extends JPanel implements ActionListener {

    Button button = new Button("Kruskal MST");
    GrafoCanvas grafoCanvas;

    public SideMenu(GrafoCanvas grafoCanvas) {

        button.setSize(30,20);
        button.addActionListener(this);
        this.grafoCanvas = grafoCanvas;
        this.add(button);

    }

    public Dimension getPreferredSize() {
        return new Dimension(175, 50);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

            KruskalMain.main(grafoCanvas.getListaNodosEnArbol().size(), grafoCanvas.getEdges());
    }
}
