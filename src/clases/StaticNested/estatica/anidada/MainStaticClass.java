package clases.StaticNested.estatica.anidada;

public class MainStaticClass {
    public static void main(String[] args) {
        Archivo.Metadata metadata = new Archivo.Metadata("archivo", "txt", 100);
        metadata.info();
    }
}
