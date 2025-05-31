*Callable<Y>*
Callable<T> es una interfaz en Java que represanta una tarea para tener un resultado
1)  Podemos ejeutar en un hilo
2)  Retortar un resultado 
3) Podemos controlar excepciones


Diferencia entre un Callable vs un runnable

Runnable =>  NO retornan un valor o informacion
Callables =>  Si retornan un valor o informacion ( usa el return)

Runnable => el manejo de excepciones es mas complejo
Callables => el manejo de excepciones es mas simple o facil

Runnable => Para su ejecucion se usa la palabra execute()
Callables =>  Para su ejecucion se usa la palabra submit()


OJO
Runnable => Resultado no esta diponible
Callables  => el Resultado si esta diponible pero se usa una Objeto llamado el Future<T>

*Callable*

Existe un metodo que se llama invokeAll()

invokeAll()=> puede ejecutar multiples tareas o proceso a la vez y esperar el resultado


invokeAll es metodo pero se se ejecuta desde ExecutorService :
Cuando se ejecuta el invokeAll() estamos usando el objeto Callables<T>
Retorna una lista de objetos de Future<T>
Tener en cuenta que el invoceAll() espera hasta que todo se termine



como funciona ?


cuando usamos el metodo invokeAll , espera que todas las tareas terminen antes de devolver un resultado 

invokeAll usa el callable , retorna un Future<T>  y para obtener la informacion se usa el .get()


***************** Future<T> *******************

Future<T>  es una interfaz que representa un resultado futuro , de una tarea o callable que se ejecuto desde un invoke



con el Future<T> puedo validar:
    1) El estado de la tarea si ya termino o sigue en ejeucion
    2) obtener el resultado de lo que retorno la tarea



Los callables permiten ser ejecutados por medio de executorService con dos metodos
invockeAll() y submit()

