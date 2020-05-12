import javax.swing.*;

public class Fibonacci {

    public static void main() {
        int n = 10, t1 = 0, t2 = 1;
        boolean creado = false;
        String secuencia = "";

        do {
            try {

                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese hasta que numero de la secuencia se necesita.", "Fibonacci", JOptionPane.QUESTION_MESSAGE));
                if (n >= 1) {
                    creado = true;

                    for (int i = 1; i <= n; i++) {
                        if(i != n) {
                            secuencia += (t1 + " + ");
                        }else{
                            secuencia += "" +t1;
                        }

                        int sum = t1 + t2;
                        t1 = t2;
                        t2 = sum;
                    }
                    JOptionPane.showMessageDialog(null, "Los primeros " + n + " terminos: "+ secuencia );
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(!creado);



    }



}

