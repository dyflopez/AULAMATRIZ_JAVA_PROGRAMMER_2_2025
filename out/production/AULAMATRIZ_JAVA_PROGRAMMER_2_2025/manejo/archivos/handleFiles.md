Manejo de archivos
IO(tradicional) / NIO (actual )en JAVA

El objetivo de las librerias de  IO /NIO es para la lectura o escritura de archivos

leer o escribir en archivos ya sea por 

Bytes o => inputStream Caracteres

textos  =>read  , write





IO => se encentra  en el packete java.io.*
NIO => es encuentra en el packete java.nio.*




IO => Orientada a fluho de datos o basa en streams
NIO => orientada mas a un biffers 

IO =>  es bloqueante: espera que temrine una operacion para avanzar con la siguiente while(... nextLine ...)
NIO => el flujo es no bloqueante  -> permite operaciones asincronas .... (se puede obtener  conn una instruccion la infomraicon del arvhivo)


IO => usa metodos BufferedReader, file, scanner... 
NIO => FILES.*      Fiels.readAllLines(); 

IO => un poco mas complejo para administracion de FILES  lento bloqueante y no tan optimo
NIO => es mucho mas completa y adminsitra mejor los FILES   Copiar, mover, pegar, crear ....



IO  

IO lee o escribir datos uno por uno ... en orden y "bloqueante"
cuando se trabaja a nivel de archivos , el programa o la lectura se detiene  linea a linea (escritura o lectura)


NIO

NIO carga la informacion en bloques o buffers ...
se peuden leer muchos datos en una sola peticion o una vez solamente-> es rapido
el codigo es mas limpio y mas veloz, mas eficinete
ya que no tiene bloqueos , no  tenemos pausas ...
