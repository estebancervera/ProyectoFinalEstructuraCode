public class Edge {

    public NodoGrafo nodo1, nodo2;
    public int peso;

    public Edge(NodoGrafo nodo1, NodoGrafo nodo2, int peso){
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.peso = peso;


    }

    public String toString(){
        return "" + nodo1.getNombre() + " - " + nodo2.getNombre() + "      "  + this.peso;
    }


}
