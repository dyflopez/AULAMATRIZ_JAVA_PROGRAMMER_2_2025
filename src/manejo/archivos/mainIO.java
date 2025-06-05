package manejo.archivos;


import java.io.*;

public class mainIO {
    public static void main(String[] args) throws IOException {
        String url = "./src/manejo/archivos/archivo.txt";
        File file = new File(url);
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());

        System.out.println("io read");
        BufferedReader reader = new BufferedReader(new FileReader(url));
        String line ;
        while ((line= reader.readLine())!=null){
            System.out.println(line);
        }


        BufferedWriter writeF = new BufferedWriter(new FileWriter(url));

        writeF.write("primera linea");
        writeF.close();

        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
