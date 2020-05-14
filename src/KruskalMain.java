import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class KruskalMain {

    public static void main(int numberOfNodes, ArrayList<Edge> edges){
       //ew Scanner(System.in);
        Kruskal mst = new Kruskal(1000);
        //	initialize fathers for the disjoint sets
        for(int i=0;i< mst.fathers.length ;i++){
            mst.fathers[i]=i;
            //System.out.println( mst.fathers[i]=i);
        }
        //	declaring the variables to load input
        int numberNodes = 0,numberEdges = 0;
        int a,b,w;


        //	we print a line to separate input from output

        //	NOW THE KRUSKAL'S ALGORITHM BEGINS
        //	We firstly declare the variables for the MST
        int mst_weight = 0, mst_edges = 0;
        int	mst_ni = 0;
        //	STEP 1:	sort the list of edges
        //	comparator is interface that sort uses
        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge p1, Edge p2) {
                return p1.peso - p2.peso;
            }
        });
        System.out.println("numbeOfNodes: " + numberOfNodes);
        //	STEP 2-3:
        String resultado = "";
        try {
            do {
                //	we brake the edge into the three integers they describe it
                a = edges.get(mst_ni).nodo1.getNombre();
                b = edges.get(mst_ni).nodo2.getNombre();
                w = edges.get(mst_ni).peso;

                //	we check if the edge is ok to be included in the MST
                //	if a and b are in different trees (if they are on the same we will create a cycle)
                System.out.println(mst.find(a) != mst.find(b));
                if (mst.find(a) != mst.find(b)) {
                    //	we unite the two trees the edge connects
                    mst.unite(a, b);
                    //	we add the weight of the edge
                    mst_weight += w;
                    //	we print the edge and count it
                    resultado += "\n" + a + " - " + b + " |  peso : " + w;
                    System.out.println(a + " " + b + " " + w);
                    mst_edges++;
                    System.out.println(" edges agregados " + mst_edges);
                }
                //	increase the index of the edge we will be chacking
                mst_ni++;
                // System.out.println("count : "+  mst_ni);
            } while ((mst_edges < numberOfNodes - 1));
            JOptionPane.showMessageDialog(null, "El grafo del " + resultado + "\nWeight of the MST is " + mst_weight);
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "El grafo es invalido. Porfavor no deje pares de nodos flotando o no conectados ");
        }
        //	Presenting the WEIGHT



    }


}
