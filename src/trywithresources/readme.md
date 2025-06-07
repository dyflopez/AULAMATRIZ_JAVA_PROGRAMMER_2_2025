*Try-with-resources*

Try-with-resources Es una estructura en java que nos ayuda o permite manejar autoamitcamente
el cierre de los recursos ya sean como :
Archivos
Sockets
Conexion a la db  

Ventajas

* Cierre automatico : Los recursos se cierrar automaticamente al salir del bloque try
* codigo menor repetitivo :  No necesitamos usar finallly para cerrar manualmente 
* Evitamos errores de memoria :   Reducimos el resgo de fugas de memoria
* Mas legible y limpio :  El codigo es mas conciso y facil de entender


Desventajas

1) Solo se puede aplicar ese tryResource solo a la interfaz   AutoCloseable
2) No se puede aplicar a todos los recursos 
3) No es tan viable cuando se usan scripts pequeños , porque es innecesario

Que e su Resurce -Recurso ?

Un Recurso es un objeto que debe cerrase despues de su Uso
* File* ( FileInputStream , FileReader)
* BufeerReader
* Scaner
*  JDBC
* cualquier libreria  Java.io.Closeable ...




