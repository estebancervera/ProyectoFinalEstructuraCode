import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class DisplayTree extends JFrame {
    JScrollPane scrollpane;
    DisplayPanel panel;


    public DisplayTree(ArbolBinario t) {
        panel = new DisplayPanel(t);
        panel.setPreferredSize(new Dimension(800, 800));
        scrollpane = new JScrollPane(panel);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();  // cleans up the window panel
    }

    public static void main(ArbolBinario tree) {

        ArbolBinario t = tree;
        int num;



        t.computeNodePositions(); //finds x,y positions of the tree nodes
        t.maxheight=t.treeHeight(t.raiz); //finds tree height for scaling y axis
        DisplayTree dt = new DisplayTree(t);//get a display panel
        dt.setVisible(true); //show the display
    }
}