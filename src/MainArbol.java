import javax.swing.*;

public class MainArbol {

    public static void main(){
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbol = new ArbolBinario();


        do{
            try {
                Object opcionO = (JOptionPane.showInputDialog(null,
                        "1. Agregar Nodo\n" +
                                "2. Recorrer inOrden\n" +
                                "3. Recorrer preOrden\n" +
                                "4. Recorrer postOrden\n" +
                                "5. Altura\n" +
                                "6. Nivel\n" +
                                "7. Buscar Dato\n" +
                                "8. Eliminar Dato\n" +
                                "9. Dibujar Arbol (TEST)\n" +
                                "10. Salir\n" +
                        "Elige una Opcion", "Arboles Binarios", JOptionPane.QUESTION_MESSAGE));


                if (opcionO == null){
                    opcion = 10;
                }else{
                    opcion = Integer.parseInt(opcionO.toString());
                }

                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Numero del Nodo", "Agregar Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = (JOptionPane.showInputDialog(null, "Ingresa el Nombre del Nodo", "Agregar Nodo", JOptionPane.QUESTION_MESSAGE));
                        arbol.agregarNodo(elemento,nombre);
                        break;
                    case 2:
                        if(!arbol.estaVacio()){
                            arbol.clearResult();
                             arbol.inOrden(arbol.raiz);
                            JOptionPane.showMessageDialog(null, arbol.getResult(),"In Orden", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbol.estaVacio()){
                            arbol.clearResult();
                            arbol.preOrden(arbol.raiz);
                            JOptionPane.showMessageDialog(null, arbol.getResult(),"Pre Orden", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbol.estaVacio()){
                            arbol.clearResult();
                            arbol.postOrden(arbol.raiz);
                            JOptionPane.showMessageDialog(null, arbol.getResult(),"Post Orden", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!arbol.estaVacio()){

                            int depth = arbol.maxDepth(arbol.raiz);
                            JOptionPane.showMessageDialog(null, " Altura del Arbol: " + depth," Altura", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                    //nivel
                        if(!arbol.estaVacio()){

                            int nivel = arbol.treeHeight(arbol.raiz);
                            JOptionPane.showMessageDialog(null, " Nivel del Arbol: " + nivel," Nivel", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }


                        break;
                    case 7:
                        if(!arbol.estaVacio()){

                           int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Numero del Nodo a buscar", "Buscar Nodo", JOptionPane.QUESTION_MESSAGE));
                           NodoArbol res = arbol.buscarNodo(numero);
                           if(res == null){
                               JOptionPane.showMessageDialog(null, "El Nodo no existe en el arbol ","Error", JOptionPane.INFORMATION_MESSAGE);
                           }else{
                               JOptionPane.showMessageDialog(null, "Nodo encontrado! " + res,"Exito", JOptionPane.INFORMATION_MESSAGE);
                           }

                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 8:
                        //eliminar
                        if(!arbol.estaVacio()){

                            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Dato del Nodo a Eliminar", "Eliminar Nodo", JOptionPane.QUESTION_MESSAGE));

                            if(!arbol.eliminar(numero)){
                                JOptionPane.showMessageDialog(null, "El Nodo no existe en el arbol ","Error", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Nodo Eliminado! ","Exito", JOptionPane.INFORMATION_MESSAGE);
                            }

                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 9:
                        if(!arbol.estaVacio()){

                            DisplayTree.main(arbol);

                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio ","Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada ","", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta ","Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El Input no es valido");
            }
        }while (opcion!=10);
    }


}
