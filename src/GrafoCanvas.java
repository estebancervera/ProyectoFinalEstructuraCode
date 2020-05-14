import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Vector;

public class GrafoCanvas extends JPanel implements MouseListener, MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if(nodoMover != null){
            this.vectorNodos.set(iNodo, new NodoGrafo(mouseEvent.getX(), mouseEvent.getY(), nodoMover.getNombre()));
            int iE = 0;
            for(Enlace enlace: vectorEnlaces){
                if(new Rectangle(enlace.getX1() - NodoGrafo.d/2, enlace.getY1() - NodoGrafo.d/2, NodoGrafo.d, NodoGrafo.d).contains(mouseEvent.getPoint())){
                    this.vectorEnlaces.set(iE, new Enlace(mouseEvent.getX(), mouseEvent.getY(), enlace.getX2(), enlace.getY2(), enlace.getPeso()));
                }
                else if(new Rectangle(enlace.getX2() - NodoGrafo.d/2, enlace.getY2() - NodoGrafo.d/2, NodoGrafo.d, NodoGrafo.d).contains(mouseEvent.getPoint())){
                    this.vectorEnlaces.set(iE, new Enlace( enlace.getX1(), enlace.getY1(), mouseEvent.getX(), mouseEvent.getY(), enlace.getPeso()));
                }
                iE++;
            }

        }
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    private Vector<NodoGrafo> vectorNodos;
    private Vector<Enlace> vectorEnlaces;
    private ArrayList<Edge> edges;
    private Point p1;
    private Point p2;
    private NodoGrafo n1, n2;
    private ArrayList<NodoGrafo> listaNodosEnArbol;
    private ArrayList<Integer> listaNombres;

    private NodoGrafo nodoMover;
    private int iNodo;

    public GrafoCanvas(){
        this.vectorNodos = new Vector<>();
        this.vectorEnlaces = new Vector<>();
        this.edges = new ArrayList<>();
        this.listaNodosEnArbol = new ArrayList<>();
        this.listaNombres = new ArrayList<>();

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }

    public void paint(Graphics g){
        super.paint(g);
        for (NodoGrafo nodo : vectorNodos){
            nodo.pintar(g);
        }
        for (Enlace enlace : vectorEnlaces){
            enlace.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getButton() == MouseEvent.BUTTON1){
            int nombre = 1;
            Boolean numeroFueValido = false;
            do {
                try {
                    nombre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre del nodo (Numeros Enteros)"));
                    if((nombre >= 0 && nombre < 1000) && (!listaNombres.contains(nombre))) {
                        numeroFueValido = true;
                        listaNombres.add(nombre);
                    }else{
                        JOptionPane.showMessageDialog(null, "Escriba unicamente numeros enteros mayores a 0 y menores a 1000 y asegurese de no repetir nombres.");
                    }

                } catch (NumberFormatException e) {

                    JOptionPane.showMessageDialog(null, "Formato Invalido. Escriba unicamente numeros enteros.");
                }
            }while(!numeroFueValido);
            this.vectorNodos.add(new NodoGrafo(mouseEvent.getX(), mouseEvent.getY(), nombre));
            repaint();
        }
        if(mouseEvent.getButton() == MouseEvent.BUTTON3){
            for (NodoGrafo nodo : vectorNodos){
                if (new Rectangle(nodo.getX()- NodoGrafo.d/2, nodo.getY() - NodoGrafo.d/2, NodoGrafo.d, NodoGrafo.d).contains(mouseEvent.getPoint())) {

                  if(p1 == null)  {
                      p1 = new Point(nodo.getX(), nodo.getY());
                      n1 = nodo;
                  }else{
                      p2 = new Point(nodo.getX(), nodo.getY());
                      n2 = nodo;
                      int peso = 1;
                      Boolean numeroFueValido = false;
                      do {
                          try {
                              peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del enlace"));
                              if(peso >= 0 ) {
                                  numeroFueValido = true;
                              }
                          } catch (NumberFormatException e) {

                              JOptionPane.showMessageDialog(null, "Input es invalido. Porfavor escriba unicamente numeros enteros mayores a 0.");
                          }
                      }while(!numeroFueValido);
                      this.vectorEnlaces.add(new Enlace(p1.x,p1.y, p2.x,p2.y, peso));
                      this.edges.add(new Edge(n1, n2, peso));
                      if(!listaNodosEnArbol.contains(n1)){
                          listaNodosEnArbol.add(n1);
                      }
                      if(!listaNodosEnArbol.contains(n2)){
                          listaNodosEnArbol.add(n2);
                      }
                      repaint();
                      p1 = null;
                      p2 = null;

                  }
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int iN = 0;
        for(NodoGrafo nodo: vectorNodos){
            if(new Rectangle(nodo.getX() - NodoGrafo.d/2, nodo.getY() - NodoGrafo.d/2, NodoGrafo.d, NodoGrafo.d).contains(mouseEvent.getPoint())){
                    nodoMover = nodo;
                    iNodo = iN;
                    break;
            }
            iN++;
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        nodoMover = null;
        iNodo = -1;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public Vector<NodoGrafo> getVectorNodos() {
        return vectorNodos;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public ArrayList<NodoGrafo> getListaNodosEnArbol() {
        return listaNodosEnArbol;
    }
}
