package peatternmatching;

public class mainPeatterMatching {
    public static void main(String[] args) {
        Helicoptero h = new Helicoptero("safari","combate",true);
        Avioneta avioneta = new Avioneta("turistica",60);
        //instance of
        if(h instanceof Helicoptero){
            if(!h.isStatus()){
               // throw new IllegalArgumentException("error atributos");
            }
            //operacion con base al tipo
            System.out.println("si es de Helicoptero");
        }
        //se requeira generar de codigo para una operacion o logica

        //Pettern Marching
    }

    public static void example (Object obj){
        if (obj instanceof String s && s.length()>50 ){
            System.out.println("larga");
        }
        if(obj instanceof  Helicoptero h  ){
            h.isStatus();
            /**
             * metodo
             *
             * metodo (h.name, h.model.h )
             * DTP , RECORTD
             */
        }
    }
}
