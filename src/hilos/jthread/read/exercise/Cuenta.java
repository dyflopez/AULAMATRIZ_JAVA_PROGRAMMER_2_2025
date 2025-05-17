package hilos.jthread.read.exercise;

public class Cuenta {

    private int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void retirar(String cajero,int monto){
        System.out.println("---Start" + cajero + "intento retro" + monto);
        if(saldo>=monto){
            System.out.println("Se permite retirar el dinero procesando....cajero" + cajero);
            try {
                Thread.sleep(3000);
                saldo-=monto;
                System.out.println("Se realizo el returi del cajero " + cajero +" monto returado " + monto + " saldo restante " + saldo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("No se realizo el returo Se realizo el returo por montos no suficientes " + saldo + " cajero  " + cajero);
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
