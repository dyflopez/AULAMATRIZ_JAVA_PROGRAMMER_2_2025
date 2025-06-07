# AULAMATRIZ_JAVA_PROGRAMMER_2_2025
*MODULARIDAD*

La modularidad en java  es una forma de organizar o separar procesos de negocio por modulos 

Caja y organizarla por paquetes o por su dominio

Ventaja 
Solo compartimos lo que necesita el modulo X para funcionar y ocultamos el codigo o procesos privador 
la logica privada no pueder modificada
Separacion de responsabilidaes

Desventaja
Nos vamos a llenar de muchos proyectos en JAva y puede ser dificil de adminsitrar


module module_name {
//exports =>  indica  que paquetes del moduo estaran disponibles para otros modulos
// Requieres  : indica la dependencia de otros modulos
// opens : exports pero hacia los frameworks ....
}