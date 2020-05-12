import java.util.Random;

public class Hilo extends Thread {

    private Random rand = new Random();
    private String[] names = { "muy importante", " el mejor",
            "el mas guapo", "el mas inteligente", "Contador",
            "Esteban", "el mas rapido", "el mas lento", "lololo",
            "Rocket League", "Trojanos.exe"};
    private double time;

    public Hilo(double time){
        this.time = time;
    }


    public void run() {
        try {
            Thread.currentThread().setPriority(rand.nextInt(7) + 2);
            Thread.currentThread().setName(names[rand.nextInt(10)]);
            System.out.println("Hilo "+ Thread.currentThread().getId() + " esta activo" );
            System.out.println("Hilo " + Thread.currentThread().getId() + " tiene prioridad de:  "+ Thread.currentThread().getPriority());
            System.out.println("Hilo " + Thread.currentThread().getId() + " se llama:  "+ Thread.currentThread().getName());
            for(int i = 0; i < 20; i ++){
                System.out.println(Thread.currentThread().getId() + " -- " + i);
                sleep((int)((time / 20.0) * 1000.0) );
            }



        }catch(Exception e){
            System.out.print("Error: " + e);
        }
    }
}
