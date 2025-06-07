package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainTryWithResource {
    public static void main(String[] args) {
        //Forma de normal tradicional
         BufferedReader br = null;
        try{
            String line;
            br = new BufferedReader(new FileReader("./src/trywithresources/archiv.txt"));
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Error lectura");
        } finally {
            if(br != null){
                try {
                    br.close();
                }catch (IOException ex){
                    System.out.println("Error lectura");
                   // ex.printStackTrace();
                }
            }
        }

        System.out.println("LECTURA MEJORADA");
        //aplicando el Try Resources
        try(BufferedReader br1 = new BufferedReader(new FileReader("./src/trywithresources/archio.txt"))){
            String linea;
            while ((linea = br1.readLine())!= null){
                System.out.println(linea);
            }
        }catch (IOException e) {
            System.out.println("error new try resource");
            //throw new RuntimeException(e);
        }
    }
}
// los InputStreamReader...