package hilos.jthread.read.example;

public class SimulatePrinter {


    public static void main(String[] args) {
        Printer canon = new Printer();
        Thread docnete1 = new Thread(()->canon.print("notas_aulamatriz_java.pdf"));
        Thread docnete2 = new Thread(()->canon.print("notas_aulamatriz_aws_developer.pdf"));
        Thread docnete3 = new Thread(()->canon.print("notas_aulamatriz_Azure-AZ-500.pdf"));


        docnete1.start();
        docnete2.start();
        docnete3.start();

        System.out.println("fin");
    }
}
