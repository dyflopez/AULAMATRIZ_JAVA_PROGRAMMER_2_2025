package hilos.jthread.read.ExecutorService;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {
    public static void sendEmail(String sendTo){
        String uuid = UUID.randomUUID().toString();
        System.out.println("El email se envio a " + sendTo + "con UUID " + uuid);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool(); // se ejecutan a demanda
        ExecutorService executorServicePool = Executors.newFixedThreadPool(3); // se ejecutan a demanda
        for (int i = 0; i <= 7; i++) {
            String email = "daniel__"+i+"__" +"@aulamatriz.co";
            executorServicePool.execute(()->sendEmail(email));
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        executorServicePool.shutdownNow();
    }
}
