# Patrones-Diseño
Integrantes: Sebastián Castellanos & Sara Piraquive

1. Gestión Restaurante
   1. Patrón de comportamiento (Template Method): Se escogió este patrón porque define la estructura de un algoritmo en la clase base, permitiendo que las subclases implementen o sobrescriban pasos específicos, en este caso, los pasos de las órdenes de cada una de las subclases gestionRestaurante.OrderFood,gestionRestaurante.OrderBeverage,gestionRestaurante.OrderDessert.
   2. Diagrama de clases ![img.png](img.png)
2. Gestión Tareas
   1. Patrón de comportamiento (Command) :Se escogió este patrón porque convierte una solicitud en un objeto independiente, además permite mantener un historial de acciones ejecutadas. En este caso, el "ManagerTarea" mantiene una pila de comandos ejecutados, lo que permite deshacer la última acción realizada y restaurar el estado anterior del sistema.
   2. ![img_1.png](img_1.png)
3. Creación Menú Restaurante
   1. Patrón creacional (Builder): Este patrón fue escogido porque con él nos permite construir objetos complejos paso paso, en este caso, el menú del restaurante. Además permitió colocar constructores dentro de objetos independientes y así poder crear MenuItaliano y cualquiera que el usuario desee.
4. Decoración Hotel
   1. Patrón estructural (Decorator): Este patrón permite añadir funcionalidades a objetos, fue escogido porque con él se puede sustituir el objeto cambiando el comportamiento del contenedor, sin necesidad de alteral la funcionalidad completa del objeto. Para la decoración de las habitaciones del hotel se puede implementar la misma interfaz "Habitacion" y al resto del código no le importa con cuál objeto se está trabajando porque el cliente podrá decorar el objeto con las personalizaciones que desee (ConChocolatesGourmet,ConFloresFrescas)
5. Implementación Sistema de Envío
   1. Patrón estructural (Bridge): Este patrón fue escogido porque permite separar la abstracción de los envíos (Interfaz) de sus implementaciones haciendo que no afecte directamente dicha abstracción, que se facilite la extensibilidad del sistema y que la empresa de logística pueda ofrecer varias opciones de envío.