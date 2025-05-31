**Sealed class**

una Sealed class (case sellada) es la encargada de restringir  que otras clases o interfaces  puedan exteneder o implementarla

esto fue introducido en Java 17  con la finalidad de Mejorar o agregar una capa de seguridad, buenas practicas y un disñeo mas mantible


Cuando utilizamos las Sealed class 
1) Modelar o asegurar la jerarquia de mis calses , dejarlas cerras o fijas
2) Garantizar que solamente un conjunto espesifico  de clases puedan implemenar la interfaz determinada
3) Agregando una seguridad en nuestro codigo o diseño del  sotfware



Temas imprtantes 

se usa una palabra reservada que s ellama permits , la que indica quien puede implementar o heredar
Se implementa la palabra reservada sealed la que se encarga de agregar esa capa de seguridad

Limitacion que las Sealed class no son compatibles con versiones anteriores a la 17 solamente comatible con las 17+

se sugiere tener claridad de que clases se va permitri implementar ya que puede aumentar la complejidad



*******
final  ->  al usar el final no permite ser extendida 
sealed -> la clase puede ser extendida solamente las que estan permitidas hacienod uso de la palabra (permits)
non-sealed -> se usa en las subclases para romper la restriccion 



interfaz permitir gato ...

gato implement anial ...


clase b extienda de non-sealed gato !!! no lo permite 