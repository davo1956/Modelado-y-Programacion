# mp-Practicas de Modelado y Programacion
Practicas de Modelado y Programación 2020-2
Practica 

Objetivo:​ El objetivo de esta práctica es implementar adecuadamente los patrones
State y Template en la resolución del problema propuesto.
1.Menciona los principios de diseño esenciales del patrón State y Template. Menciona
una desventaja de cada patrón.
2. Se te ha encargado implementar el siguiente problema:
➔ La empresa “Mi hogarcito” te ha pedido programar un robot que servirá como
constructor de casas. Si el prototipo cumple con los requerimientos y las pruebas, los
producirán en masa para toda su franquicia.
◆ El robot debe estar encendido todo el tiempo esperando a que un operador lo
active, pero si no está trabajando puede estar suspendido. Al activarse, el
robot solicita el tipo de casa a construir. El operador elige una de las
opciones ofrecidas por la empresa.
◆ El robot manda mensajes al operador donde informa el estado del robot y sus
avances. Para este prototipo se asume que todas sus casas tienen una
construcción análoga, todos estos pasos corresponden a un mismo estado:
1. Preparación del terreno
2. Colocación de cimientos
3. Construcción del esqueleto de la casa*
4. Instalación eléctrica y plomería
5. Aislamiento de la casa*
6. Acabados
◆ El robot se encuentra en un área de trabajo en donde existe un terreno, una
estación de descanso y una área de materiales que debe recolectar para
trabajar. El robot empieza y termina su funcionamiento en el área de
descanso.
◆ Si el robot está ​suspendido​ no puede hacer otra cosa más que ​activarse​. Si
el robot está ​caminando​ puede ​suspenderse​ de nuevo, pero no puede
construir​. Si el robot está ​recibiendo una orden​ del operador no puede
suspenderse​ ni ponerse a ​c
aminar​, solamente empezará a ​trabajar​ hasta
tener la orden del operador. Una vez que recibe la orden del operador, el
robot se dirige al área de materiales para ​reabastecerse​. El robot se sigue
reabasteciendo hasta terminar, por lo que no podrá ​caminar, trabajar ​ni
suspenderse​ mientras lo hace. Al recolectar los materiales, se dirige al
terreno y empieza a ​trabajar​. Si está ​trabajando​, ya no podrá tomar otra
orden del operador hasta terminar la casa y no se pondrá a ​caminar​ mientras
trabaja​. Al terminar la casa, el robot se dirige al área de descanso donde se
suspenderá​ nuevamente.
◆◆Dado que es una simulación, el usuario realmente no puede interferir en
estados que el robot pasa automáticamente, como en la transición de trabajar
a suspender. Por esta razón entre cada estado se mostrará la pantalla de
opciones del usuario. Si la transición es automática y el usuario pide una
acción prohibida en este estado, el robot dirá que no puede realizar la acción
que se le pide e inmediatamente realizará la transición al siguiente estado.
La construcción tendrá un costo inicial de $1,000,000, pero el uso de los
materiales sumará un costo extra a la casa dependiendo de la elección del
operador. La empresa “Mi hogarcito” ofrece las siguientes opciones para una
casa:
● Esqueleto de concreto - $500,000
● Esqueleto reforzado - $1,000,000
● Aislamiento de concreto - $2,000,000
● Aislamiento de vidrio - $2,500,00
● Aislamiento de madera - $1,000,000
● Aislamiento reforzado - $3,000,000
En los pasos 3 y 5 se deberán ver reflejados las instrucciones del operador.
Agrega una clase principal con un método main para probar el programa. En el método se
debe crear un objeto de la clase Robot y un menú para el operador. El menú debe permitir
la interacción con el robot. Si alguna acción no puede realizarse, se debe imprimir un
mensaje para indicarle al usuario.
El programa debe saludar al operador, mostrarle el estado actual del robot y las acciones
disponibles del mismo. Si el operador ingresa una opción, la pantalla debe imprimir la
respuesta del robot (por ejemplo, el robot inicia suspendido, el usuario elige la opción de
“encender” y se debe mostrar en pantalla “robot esperando instrucciones para construcción
de casa”; si el robot está suspendido y se le solicita una casa, el robot debería responder
“no se puede hacer nada con el robot suspendido”). Cuando el robot imprima las opciones
de la casa, el operador puede elegir alguna opción ingresando un id. Después se debe
mostrar en pantalla el proceso de construcción. Al terminar, se debe indicar que la casa se
finalizó, la descripción de la casa y el costo final. Finalmente, el robot regresará al área de
descanso y se suspenderá.


David Pérez Jacome : Autor.
