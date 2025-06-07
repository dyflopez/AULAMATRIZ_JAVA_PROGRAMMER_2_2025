*ENUM*
Un Enum (Enumerador) es una clase especial de java que representa un conjunto de constantes.
Se introdujo en java 5+ y se recomienda usar cuando conocemos el valor de las contantes desde el inicio


Datos curiosos

1) son clases especiales  usan o implementan de java.lang.enum
2) son final por defecto 
3) sol aceptan valores definidos
4) los valores son aignados como constantes
5) podemos tener hasta metodos en los enums


enum Dia {LUN ,MARTES, MIERCOLES}

enumMap agenda <ENUM,STRING> agenda = new enumMap<Dia.class>
agenda.put(Dia.LUNES, "Descanso");
agenda.put(Dia.MARTES, "trabajo");

Enums me permite usar algunos metodos para extraer informacion
name()  = Devuelve el nombre de la constante
ordinal() =  Devuelve la posicion (indice)
ValueOf() -> convierte en Strubg a enum
values()-> Devuelve un array de todas las contantes


