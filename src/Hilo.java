import java.util.Random;

public class Hilo extends Thread {

    private Random rand = new Random();
    private String name;
    private double time;

    public Hilo(double time, String name){
        this.time = time;
        this.name = name;
    }


    public void run() {
        try {
            Thread.currentThread().setPriority(rand.nextInt(7) + 2);
            Thread.currentThread().setName(name);
            System.out.println("Hilo " + Thread.currentThread().getName() + " tiene prioridad de:  "+ Thread.currentThread().getPriority());
            for(int i = 1; i <= 20; i ++){
                System.out.println(Thread.currentThread().getName() + " -- " + i);
                sleep((int)((time / 20.0) * 1000.0) );
            }

            System.out.println(
                    "-----------------------------------\n" +
                    "-----------------------------------\n" +
                    "EL HILO COLOR " + Thread.currentThread().getName() + " HA ACABADO!\n" +
                    "-----------------------------------\n" +
                    "-----------------------------------\n"

            );


        }catch(Exception e){
            System.out.print("Error: " + e);
        }
    }
}
