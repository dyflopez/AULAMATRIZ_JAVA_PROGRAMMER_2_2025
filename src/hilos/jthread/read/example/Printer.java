package hilos.jthread.read.example;

public class Printer {

    public  void print(String document){
    //public synchronized void print(String document){

        System.out.println("Start print " + document);
        try {
            System.out.println("printing---"+ document);
            Thread.sleep(4000);
            System.out.println("printed---"+ document);
        } catch (InterruptedException e) {
            System.out.println("Error---"+ e.getMessage());
            System.out.println("Error---"+ e.getCause());
            throw new RuntimeException(e);
        }
    }
}
