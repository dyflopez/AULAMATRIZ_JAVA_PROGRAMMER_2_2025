***ExecuterService***
Es una interfaz de java que permite la administracion de una manera
muy eficiente y controlada de mis hilos

nos va a proporcionar 4 metodos para la administracion

1) newCacheThreadPool => permite ejecutar hilos a demanda
2) newFixedThreadPool=>  Crea un pool de hilos fijos
3) newSingleThread Execute=>  Permite ejecurar un unico hilo
4) newScheduledThreadPool=>  Permite agender al ejecucion de mis hilos

***Porque usar los ExecuterService***

Reutilizacon mas rapida
Facil adminsitracion
Agrupar por pool de hilos
Agendar o temrinar hilos

***newCacheThreadPool***
Crea un ExecuterService que permite:

* lanza nuevo hilos segun la demanda
* Reutiliza hilos ya terminados o disponibles
* No tiene un limite de ejecucion de hilos (Salvo la CPU Equipo)

ExecuterService executor = Executors.newCacheThreadPool();

Ventajas 

Rapido para tareas cortas
Ejecuciones a demanda ..evita crear nuevos hilos o repetir cdigo
Escala cuando el cliente lo requeire

Desventaja 

Se peuden crear muchos hilos y puede ocupar la memoria o CPU de la maquina


***newFixedThreadPool***

Crear un pool (grupo) de hilos para ser ejecutado
1) Ejecuta tareas en paralelo pero con un n numero de hilos
2) si hay mas teareas que hilos diponible, los encola hasta que un pool quede libre
3) Los hilos son reutilizados despues de terminar

Ventajas

controlar el total de hilos a ejecutar
Estamos cuidando el procesar la CPU
Facul de administrar
Es recomendable para tareas de larga, corta o baja de ejecucion

Desventaja tenemos

Si hay muchas tareas se acumulan hasta que se libere algun pool
no escala automaticaticamente ..... nos referimos que estamos limitando el proceso en un pool definico

