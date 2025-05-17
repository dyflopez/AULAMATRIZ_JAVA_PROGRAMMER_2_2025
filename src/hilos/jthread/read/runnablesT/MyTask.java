package hilos.jthread.read.runnablesT;

public class MyTask implements Runnable{
    @Override
    public void run() {
        try {
            int factorial=1;
            for (int i = 1; i < 10; i++) {
                factorial*=i;
                System.out.println("numero " +factorial + " iteracion"+ (i));
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
