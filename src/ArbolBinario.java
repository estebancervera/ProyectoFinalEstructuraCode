import javax.print.attribute.standard.NumberOfDocuments;

public class ArbolBinario {

    NodoArbol raiz;
     private  String result = "";
    int totalnodes = 0;
    int maxheight=0;
    String inputString = new String();

    int maxDepth(NodoArbol node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.hijoIzquierdo);
            int rDepth = maxDepth(node.hijoDerecho);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }


    public int treeHeight(NodoArbol t){
        if(t==null) return -1;
        else return 1 + max(treeHeight(t.hijoIzquierdo),treeHeight(t.hijoDerecho));
    }



    public int max(int a, int b){
        if(a>b) return a; else return b;
    }

    public void computeNodePositions() {
        int depth = 1;
        inorder_traversal(raiz, depth);
    }
    int getLevelUtil(NodoArbol node, int data, int level)
    {
        if (node == null)
            return 0;

        if (node.dato == data)
            return level;

        int downlevel = getLevelUtil(node.hijoIzquierdo, data, level + 1);
        if (downlevel != 0)
            return downlevel;

        downlevel = getLevelUtil(node.hijoDerecho, data, level + 1);
        return downlevel;
    }

    /* Returns level of given data value */
    int getNivel(NodoArbol node, int data)
    {
        return getLevelUtil(node, data, 1);
    }


    public ArbolBinario(){
        raiz = null;
    }

    public void agregarNodo(int dato, String nombre){
        NodoArbol nuevo = new NodoArbol(dato, nombre);
        if (raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true){
                padre = aux;
                if(dato < aux.dato){
                    aux = aux.hijoIzquierdo;
                    if (aux == null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else {
                    aux = aux.hijoDerecho;
                    if(aux == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean estaVacio(){
        return raiz ==null;
    }

    public void inOrden(NodoArbol r){

        if (r != null) {
            inOrden(r.hijoIzquierdo);

            result = result +  r.dato + ", ";

            inOrden(r.hijoDerecho);
        }
    }
    public void postOrden(NodoArbol r){

        if (r != null) {



            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            result = result +  r.dato + ", ";
        }
    }
    public void preOrden(NodoArbol r){

        if (r != null) {

            result = result +  r.dato + ", ";
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }


    public NodoArbol buscarNodo(int d){
        NodoArbol aux = raiz;
        while(aux.dato != d){
            if(d <aux.dato ){
                aux = aux.hijoIzquierdo;
            }else{
                aux = aux.hijoDerecho;
            }
            if(aux == null){
                return null;
            }

        }
        return aux;
    }


    public void inorder_traversal(NodoArbol t, int depth) {
        if (t != null) {
            inorder_traversal(t.hijoIzquierdo, depth + 1); //add 1 to depth (y coordinate)
            t.xpos = totalnodes++; //x coord is node number in inorder traversal
            t.ypos = depth; // mark y coord as depth
            inorder_traversal(t.hijoDerecho, depth + 1);
        }
    }


    public NodoArbol insert(NodoArbol root, int s) { // Binary Search tree insert
        if (root == null) {
            root = new NodoArbol(s, null, null);
            return root;
        }
        else {
            if (((root.dato)) == 0) {
                return root;  /* duplicate word  found - do nothing */
            } else   if (((root.dato)) < 0)
                root.hijoIzquierdo = insert(root.hijoIzquierdo, s);
            else
                root.hijoDerecho = insert(root.hijoDerecho, s);
            return root;
        }
    }

    public boolean eliminar(int d){
        NodoArbol aux = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzquierdo =true;
        while(aux.dato != d){
            padre = aux;
            if(d < aux.dato){
                esHijoIzquierdo = true;
                aux = aux.hijoIzquierdo;
            }else{
                esHijoIzquierdo = false;
                aux = aux.hijoDerecho;
            }
            if(aux == null){
                return false;
            }

        }

        if(aux.hijoIzquierdo == null && aux.hijoDerecho == null){
            if(aux == raiz){
                raiz = null;
            }else if (esHijoIzquierdo){
                padre.hijoIzquierdo = null;

            }else{
                padre.hijoDerecho = null;
            }
        }else if (aux.hijoDerecho == null){
            if(aux == raiz){
                raiz = aux.hijoIzquierdo;
            }else if (esHijoIzquierdo){
                padre.hijoIzquierdo = aux.hijoIzquierdo;

            }else{
                padre.hijoDerecho = aux.hijoIzquierdo;
            }
        }else if (aux.hijoIzquierdo == null){
            if(aux == raiz){
                raiz = aux.hijoDerecho;
            }else if (esHijoIzquierdo){
                padre.hijoIzquierdo = aux.hijoDerecho;

            }else{
                padre.hijoDerecho = aux.hijoDerecho;
            }
        }else{
            NodoArbol remplazo = conseguirRemplazo(aux);

            if (aux ==  raiz){
                raiz = remplazo;
            }else if (esHijoIzquierdo){
                padre.hijoIzquierdo = remplazo;
            }else{
                padre.hijoIzquierdo = remplazo;
            }
            remplazo.hijoIzquierdo = aux.hijoIzquierdo;
        }
        return true;
    }

    private NodoArbol conseguirRemplazo(NodoArbol rem){
        NodoArbol remPadre = rem;
        NodoArbol remplazo = rem;
        NodoArbol aux = rem.hijoDerecho;
        while(aux != null){
            remPadre = remplazo;
            remplazo = aux;
            aux = aux.hijoIzquierdo;
        }
        if(remplazo != rem.hijoDerecho){
            remPadre.hijoIzquierdo = remplazo.hijoDerecho;
            remplazo.hijoDerecho = rem.hijoDerecho;
        }
        return remplazo;
    }

    public void clearResult(){
        result = "";
    }


    public String getResult() {
        return result;
    }
}
