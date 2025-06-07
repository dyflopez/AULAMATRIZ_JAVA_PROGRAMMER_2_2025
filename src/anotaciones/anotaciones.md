*Anotaciones*@

es una marca d emetadatos la cual empieza con @<nombreAnotacion>
las anotacioens se pueden aplicar a metodos, campos , parametros,etc

Sirven para dar instrucciones al compilador al framework

@override
@Deprecated
@Function

@Controller
@Service
@Override <- quedo deprecado ... porque el contenedor no respetaba el singleton


@Retention => es una meta-data que indica cuanto tiempo va a mantenerse disponible una anotacion
SOURCE => La notacion se elimina al compilar 
CLASS => la anotacion se guardaen el .class , 
RUNTIME =>  Se conserva y es accesible en tiempo de ejecucion


@Target 
Definde el tipo de elemeto que se le puede aplicar la anotacion
TYPE => Clases,INTERFACES, ENUMS
METHODS => Metodos
FILED => Atributos/ Variables de clase
CONTRUCTOR => CONTRUCTORES
LOLCAL_VARIABLE => Variables local      @MyAnnotation int edad = x;

