Respuestas de reflexión Tp1 
1. ¿Qué responsabilidades asignaste a cada o objeto?
En este Proyecto utilizaron 3 “objetos”, cada uno de ellos se les asignaron las responsabilidades de..: 
Paquete: Su responsabilidad es conocer su propia identidad (ID, descripción, peso) y gestionar los cambios de su estado interno durante su ciclo de vida logística.	
Envío: Actúa como el coordinador. Su responsabilidad es agrupar un máximo de 3 paquetes, calcular el costo total de la logística (sumando pesos y aplicando recargos) y notificar a los paquetes cuándo inician o finalizan su recorrido.
Main: Su responsabilidad es la orquestación del sistema, la relacion entre los 2 elementos (o más). Crea los objetos, los relaciona, almacena el registro de la jornada en una lista (“ArrayList”) y dispara las acciones de prueba.
2. ¿Qué decisiones te resultaron difíciles?
La decisión más difícil fue cambiar el enfoque de programación tradicional a uno orientado a objetos. Acostumbrado a ver los datos como una planilla estática que se modifica desde afuera, me costó asimilar al principio cómo delegar responsabilidades, logrando que sea el objeto “Envio” quien le envíe un mensaje a “Paquete” para que este último actualice su propio estado, en lugar de forzar el cambio directamente desde la clase principal.
3. ¿Qué métodos decidiste hacer privados y por qué?
Decidí hacer privado el método “calcularPesoTotal()” porque dentro de la clase “Envio”. Lo hice porque es una regla de negocio y una operación matemática estrictamente interna. Al cliente o a la clase “Main” no le interesa saber cómo el envío suma los kilos; solo necesitan llamar al método público “calcularCostoFinal()”. Al hacerlo privado, oculto la complejidad interna y 	protejo el funcionamiento de la clase.
4. ¿Qué setters evitaste implementar y por qué?
Evité implementar un “setEstado()” genérico en la clase “Paquete”. Si dejaba un setter abierto, cualquier parte del programa podría haber cambiado el estado a valores inválidos o saltarse etapas lógicas de la entrega. En su lugar, creé métodos que representan acciones reales del negocio (como “ponerEnPreparacion()” o “enviarADistribucion()”) para garantizar que el estado del paquete cambie de forma controlada y segura.
5. ¿Qué código tuviste que cambiar al incorporar herencia?
Para incorporar herencia no tuve que modificar la lógica interna de la clase base “Envio” con condicionales múltiples (evitando los “if/else”). En su lugar, creé nuevas clases (“EnvioExpress” y “EnvioInternacional”) que extienden de “Envio”. El único código que debí modificar fue el método “calcularCostoFinal()”, utilizando “@Override” en las clases hijas para aplicar los recargos o impuestos específicos de cada tipo, y el “Main” para instanciar estos nuevos objetos.

									Juan C. Del Castillo
