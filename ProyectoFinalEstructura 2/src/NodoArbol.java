public class NodoArbol {

    int dato;
    String nombre;
    NodoArbol hijoIzquierdo, hijoDerecho;
    int xpos;  //stores x and y position of the node in the tree
    int ypos;


    public NodoArbol(int dato, String nombre){
        this.dato = dato;
        this.nombre = nombre;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;

    }


    public NodoArbol(int x, NodoArbol l, NodoArbol r) {
        hijoIzquierdo = l;
        hijoDerecho = r;
        dato = x;
    }

    public String toString(){
        return nombre + ": contiene el dato: " + dato;
    }

}
