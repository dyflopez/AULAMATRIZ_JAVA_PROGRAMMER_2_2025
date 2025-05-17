package hilos.jthread.read;

public class TeadMain {

    private static final  Object lock  = new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(()->{
               synchronized (lock){
                   System.out.println("Inicio thread");
                   try {
                       System.out.println("dentro del try");
                       lock.wait();
                       //TIME_WAITING
                       System.out.println("despues del wait");
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
        });

        System.out.println("El estado del hilo es " + thread.getState());
        thread.start();

        for (int i =0;i<5;i++){
            Thread.sleep(2000);
            System.out.println("El estado del hilo es " + thread.getState());
        }
        synchronized (lock){
            System.out.println("Main: va notificar al hilo");
            lock.notify();
        }
        thread.join();
        while (true){
            System.out.println("El estado del hilo es " + thread.getState());
            Thread.sleep(2000);
        }

    }
}
