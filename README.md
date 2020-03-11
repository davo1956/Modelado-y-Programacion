# mp-Practicas de Modelado y Programacion
Practicas de Modelado y Programación 2020-2
Practica 1.

Objetivo:​ El objetivo de esta práctica es implementar adecuadamente los patrones
Strategy y Observer en la resolución del problema propuesto.
1.Menciona los principios de diseño esenciales del patrón Strategy y Observer.
Menciona una desventaja de cada patrón.
2. Se te ha encargado implementar la siguiente simulación:
Alicia, Bob, César, Diego y Erika desean contratar los servicios de las siguientes
compañías: Netflix, Amazon Prime video, Twitch, Spotify y YouTube. La simulación
representará 5 días en los que los usuarios probarán los servicios. El primer día de su
suscripción es gratis, pero a partir del segundo día se debe pagar una tarifa. En caso de que
un usuario cancele su suscripción en algún momento y posteriormente la renueve, deberá
pagar desde el primer día. Las tarifas son las siguientes:

Netflix cobra $7 diarios para un sólo dispositivo, $10 para 2 dispositivos y $15 para 4
dispositivos.

Amazon tiene una versión de usuario normal con un costo de $7 diarios y una
versión premium con un costo de $13.

Twitch tiene una versión de usuario normal con un costo de $6 diarios. Sin embargo,
si el cliente tiene una suscripción a Amazon prime, se le hará un descuento del 50%.

Spotify es gratis para los usuarios normales, pero cobra $4 diarios por un servicio
premium.

YouTube es gratis para usuarios normales, pero cobra $6 diarios para los usuarios
premium.

Cuando un usuario se suscribe a un servicio, se le envía un mensaje de bienvenida. Si el
usuario se ha suscrito nuevamente luego de haber cancelado su suscripción, se le recibirá
con un mensaje “Bienvenido de vuelta <Cliente>”.
Cada día, los servicios cobran su monto dependiendo de la versión contratada y además,
envían una recomendación para el cliente (por ejemplo un show, una película, un disco, un
video, etc.)

La forma en que se cobra es automatizada. El sistema de cobro es único, por lo que deberá
cambiar su estrategia de cobro dependiendo de la versión del servicio del cliente. Si le llega
un cobro de Netflix deberá decidir cuánto dinero cobrar. Además, se le notificará al usuario
con un mensaje que especifique lo que está pagando. (por ejemplo: Alicia paga $15 por el
servicio de Netflix para 4 dispositivos). Este mensaje es único e individual para cada
servicio. Al iniciar un día el sistema debe recibir una petición del servicio y descontar de su
cuenta de banco la cantidad requerida en el orden en que llegan los cobros. El orden en que
llegan los cobros depende de ustedes.
Los clientes pueden decidir cancelar la suscripción a un servicio en cualquier día y volverse
a suscribir más adelante, además de poder cambiar la versión de su suscripción (por
ejemplo, cambiar de la versión gratuita de spotify a una premium).
Cada cliente tiene una cantidad limitada de dinero con la que paga el servicio durante esta
simulación. Si un cliente no puede pagar el servicio pierde su suscripción y deja de recibir
notificaciones.
Al perder o cancelar la suscripción, se le debe notificar al cliente con un mensaje (por
ejemplo: “Lamentamos que dejes el servicio <Cliente>”).

Alicia, al tener dinero suficiente, contrata todos los servicios con la versión más cara
disponible desde el primer día. Inicia la simulación con $500.

Bob, creyendo que puede pagar todos los servicios, contrata la versión más cara
disponible, sin embargo inicia con $40.

César inicia con $40 y él contrata Spotify Premium y se suscribe a Youtube en su
versión gratuita.

Diego se suscribe a Netflix para dos dispositivos y Amazon Prime video en su
versión premium. En el segundo día, se suscribe a Twitch. Para el 3er día se
suscribe a Spotify gratis y cancela su suscripción a Netflix. Para el cuarto día se
suscribe nuevamente a Netflix para 4 dispositivos. Él inicia con $180.

Erika se suscribe a Netflix para 4 dispositivos, Twitch en su versión normal y, Spotify
y YouTube gratis. Para el segundo día cambia su suscripción a Spotify premium y
Youtube premium. El tercer día cancela la suscripción de Netflix y contrata Amazon
Prime video premium. Ella inicia con $300.

David Pérez Jacome : Autor.
