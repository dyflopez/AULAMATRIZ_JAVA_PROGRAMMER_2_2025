package hilos.jthread.read.runnablesT;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = ()->{
            System.out.println("listar tareas");
        };

        Thread hilo = new Thread(task);
        System.out.println(hilo.getState());
        hilo.start();
        Thread.sleep(2000);
        System.out.println(hilo.getState());
        System.out.println("*****************");

        Thread threadMyTaskClass = new Thread(new MyTask());
        System.out.println(threadMyTaskClass.getState());
        threadMyTaskClass.start();
        System.out.println(threadMyTaskClass.getState());
    }
}
