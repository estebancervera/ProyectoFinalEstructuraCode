import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private JButton arreglosButton;
    private JButton vectoresButton;
    private JButton fibonacciButton;
    private JButton tablasHashButton;
    private JButton burbujaButton;
    private JButton aleatorioButton;
    private JButton pilasButton;
    private JButton colasButton;
    private JButton hilosButton;
    private JButton listaButton;
    private JButton crearArbolButton;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JLabel a;
    public JPanel panel;
    private JButton grafoButton;

    public UI() {
        arreglosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                 Array.main();
            }
        });
        vectoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Vectors.main();
            }
        });
        fibonacciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Fibonacci.main();
            }
        });
        tablasHashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                HashTable.main();
            }
        });
        burbujaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Burbuja.main();
            }
        });
        aleatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RandomNumber.main();
            }
        });

        pilasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Pila.main();
            }
        });
        colasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Cola.main();
            }
        });
        hilosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                HilosMain.main();
            }
        });
        listaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ListaCircular.main();
            }
        });
        crearArbolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainArbol.main();
            }
        });
        grafoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GrafoMain.main();
            }
        });


    }

    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }
}
