package hilos.jthread.read;

public class TreadMainBLOCKED {

    private static final Object street = new Object();//lock
    private static final Object street2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(street);
       /// System.out.println(street2);

        Thread thread1 = new Thread(()->{
            System.out.println("Inicio thread1");
            synchronized (street){
                try {
                    Thread.sleep(4000);
                    //while (true);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
               // System.out.println("Termina thread1 y libera el lock - proceso");
            }
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Inicio thread2");
            synchronized (street){
                try {
                    Thread.sleep(1000);
                   // while (true);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println("Termina thread2 y libera el lock - proceso");
            }
        });

        System.out.println("Estado hilo1 "  + thread1.getState());
        System.out.println("Estado hilo2 "  + thread2.getState());

        thread1.start();
        thread2.start();
        while (true){

            System.out.println("*********************");
            System.out.println("Estado hilo1 "  + thread1.getState());
            System.out.println("Estado hilo2 "  + thread2.getState());
            System.out.println("*********************");
            Thread.sleep(1000);
        }


    }
}
