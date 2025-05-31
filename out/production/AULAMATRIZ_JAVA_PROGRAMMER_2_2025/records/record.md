*Records en Java*

Un Records es una clase la cual nos sirve para crear datos o objetos que son inmutables en Java


Records se  han venido nombrando desde java 14+

en java 16 los records de volvieron mas estables <-



// TODO PASAR A UNA TABLA
DTO (Data Transfer object )

un patron de diseño que simplemente *representa* un objeto de datos
Patron o Disñeo de arquitectura

Proposito de este DTO => trasporar entre las distintas capas el objeto
DTO = POJO

podmeos usar lombok

Problema es que un DTO es una clase  facil de mutar, queda a la experiencia del desarrollador

Los DTO por ser una clase permite hacer herencia


Record

Es una opcion adecuada o correcta de que mis objetos  en verdad sea inmutables

los ricords se establecieron su uso desde java 16/17 ...

Records nos ayuda a la creacion de objetos inmutables

para aplicar un record solo hace falta usar la palabra reservada record (record es una palabra reservada)

La estrucutra

Record <NombreClase> (tipoDato nommbreVariable){}  

Record no es necesario usar los metodos get and set

Diferencia es que los ricords no permiten la herecia , solo la implementacion de interfaces



**VENTAJAS**





