package clases.StaticNested.estatica.anidada;

public class Archivo {
    /**
     *  Clases satatic nested :
     *  - Son clases estaticas que estan anidadas dentro de otra clase
     *  - Se accede a ellas mediante la clase que las contiene
     *  - No pueden acceder a los miembros de instancia de la clase externa
     */
    static class Metadata {
        private String nombre;
        private String extension;
        private int tamano;

        public Metadata(String nombre, String extension, int tamano) {
            this.nombre = nombre;
            this.extension = extension;
            this.tamano = tamano;
        }

        public String getNombre() {
            return nombre;
        }

        public String getExtension() {
            return extension;
        }

        public void info() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Extension: " + extension);
            System.out.println("Tamano: " + tamano);
        }
    }
}
