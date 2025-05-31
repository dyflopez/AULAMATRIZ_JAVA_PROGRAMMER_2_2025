package hilos.jthread.read.callable.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

public class CollableMain {

    //metodo nos va retornar el ID de ejecucion del correo  para traza
    public static String enviarEmailSimulado(String destinatario, int numeroCorreo) {
        String uuid = UUID.randomUUID().toString();
        System.out.println("Envio correo #" + numeroCorreo + " -> Destinatario " +destinatario + " id envio " + uuid);
        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
        }
        return uuid;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //CallAble es como si fiera un poll ejecuciones...
        List<Callable<String>> TaskEmailSend = new ArrayList<>();

        for (int i =0 ; i<=5;i++){
            int id =i;
            String correo = "user.aulamatriz"+i+"@aulamatriz.edu.co";
            TaskEmailSend.add(()->enviarEmailSimulado(correo,id));
            //executor.execute(()-> enviarEmailSimulado("daniel@hotmail.es",id ));
        }

        List<Future<String>> resultTask = executor.invokeAll(TaskEmailSend);


       // executor.shutdown();

        System.out.println(resultTask.size());

        for (Future<String> resultFuture : resultTask){
            System.out.println("El id de envio de correos es " + resultFuture.get()   + " ---isDone " + resultFuture.isDone() + "  isCancelled  "  +resultFuture.isCancelled());
        }

        System.out.println("***********");
        //Ejecucion con el submit
        Future<String>  result =  executor.submit(()->enviarEmailSimulado("daniel0223@hotmail.es",23));

        System.out.println( result.get());

        executor.shutdown();
    }
}
