package manejo.archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class mainNIO {
    public static void main(String[] args) throws IOException {
        String url = "./src/manejo/archivos/archivo-2.txt";

        /**
         * NIO es un poco "moderna"  para el manejo de archivos, rutas y Directorios ,
         * Es un poco mas limpio y funciona un poco mas rapido
         *
         * Path -> es una forma mas eficinete de trabajar con rutas o files
         * Files -> metodo statico para administrar el Files (read, write, copy
         * Streams -> al usar el Stream en NIO devovler un Stream<String> de datos para usar una lamnda ...
         */


        Path ruta  = Paths.get("./src/manejo/archivos/dnaiel.txt");
        Path ruta2  = Paths.get("./src/manejo/archivos/daniel/archivo-copy.txt");
        Path ruta3  = Paths.get("./src/manejo/archivos/a.txt");
        System.out.println(ruta.getFileName());
        System.out.println(Files.exists(ruta));

        System.out.println("***************");
        var stringList = Files.readAllLines(ruta);
        stringList
                .stream()
                .filter(s ->  s.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //Escritura en los FILES

        List<String> nuevoContenido  =  List.of("Diana","Paula","tecno","juan");
        Files.write(ruta,nuevoContenido);
        Files.write(ruta,nuevoContenido);

        //Files.copy(ruta,ruta2);

        new File("./src/manejo/archivos/archivo.txt").renameTo(new File("./src/manejo/archivos/archivo-2.txt"));

        Files.move(ruta,ruta2);

    }
}
