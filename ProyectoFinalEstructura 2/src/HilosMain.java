public class HilosMain {


    public static void main() {

        Hilo hilo1 = new Hilo(15.0);
        Hilo hilo2 = new Hilo(10.0);
        Hilo hilo3 = new Hilo(20.0);
        Hilo hilo4 = new Hilo(5.0);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }

    private static void desincronizados(Hilo hilo1, Hilo hilo2,Hilo hilo3, Hilo hilo4){
        outer:
        while (true) {
            if (!hilo1.isAlive()) {
                hilo2.start();
                while (true) {
                    if (!hilo2.isAlive()) {
                        hilo3.start();
                        while (true) {
                            if (!hilo3.isAlive()) {
                                hilo4.start();
                                while (true) {
                                    if (!hilo4.isAlive()) {
                                        break outer;
                                    }
                                }
                            }
                        }
                    }
                }


            }
        }
    }
}



