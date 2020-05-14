import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {


    public static void main(){


        int n = 10, t1 = 0, t2 = 1;
        boolean creado = false;
        boolean cancel = false;
        String secuencia = "";
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();

         do {
            try {

                Object obj =  (JOptionPane.showInputDialog(null, "Ingrese cuantos numeros random necesita?", "Random Numbers", JOptionPane.QUESTION_MESSAGE));

                if (obj == null){
                    cancel = true;

                }else{
                   n = Integer.parseInt(obj.toString());
                   creado = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El input que ingreso no es valido.");
            }
        }while(!creado && !cancel);

         if(creado){
             if (n >= 1) {
                 creado = true;

                 for(int i = 0; i < n; i++){

                     array.add(rand.nextInt(100));

                 }


                 JOptionPane.showMessageDialog(null, "Los  " + n + " numeros random son: "+ array.toString() );
             }else{
                 JOptionPane.showMessageDialog(null, "Ingreso un numero menor o igual a 0.");
             }
         }

        ////////////



    }



}
