package enumeradores;

import borrar.enums.Nivel;

public class MainEnumeradores {
    public static void main(String[] args) {
        Dia dia = Dia.LUNES;
        System.out.println(dia.name());
        System.out.println(dia.ordinal());

        switch (dia){
            case LUNES -> System.out.println("Inicio Semana" );
            case MARTES -> System.out.println("Segundo dia  Semana");
            case MIERCOLES -> System.out.println("a descansar");
            default -> System.out.println("dia de descanso");
        }

        //los enum se pueden iterar
        for(Dia d :Dia.values()){
            System.out.println(d.name() + " posicion " + d.ordinal());
        }

        System.out.println("****");
        System.out.println(Nivel.BAJO.getPrioridad());
        System.out.println(Nivel.ALTO);
        System.out.println("****");
        Nivel level =Nivel.findLevel("dificultad Facil");
        System.out.println(level);
    }
}
