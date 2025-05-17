package hilos.jthread.read.exercise;

public class ExerciseMain {

    public static void main(String[] args) throws InterruptedException {
        Cuenta cuenta = new Cuenta(1000);
        Thread t1 = new Thread(()-> cuenta.retirar("Caja 1" , 400));
        Thread t2 = new Thread(()-> cuenta.retirar("Caja 2" , 1000));
        Thread t3 = new Thread(()-> cuenta.retirar("Caja 3" , 400));
        Thread t4 = new Thread(()-> cuenta.retirar("Caja 4" , 200));



        t1.start();
        t2.start();
        t3.start();
        t4.start();

        while (true){
            System.out.println("****************************");
            System.out.println(t1.getState());
            System.out.println(t2.getState());
            System.out.println(t3.getState());
            System.out.println(t4.getState());
            System.out.println("saldo monutoreo es "+ cuenta.getSaldo());
            System.out.println("****************************");
            Thread.sleep(1000);
        }
    }
}
