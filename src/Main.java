import gestionTareas.Comando;
import gestionTareas.ComandoTareaCompletada;
import gestionTareas.ManagerTarea;
import gestionTareas.Tarea;

public class Main {

    public static void main(String[] args) {

        gestionRestaurante foodOrder = new OrderFood();
        foodOrder.processOrder();

        gestionRestaurante beverageOrder = new OrderBeverage();
        beverageOrder.processOrder();

        gestionRestaurante dessertOrder = new OrderDessert();
        dessertOrder.processOrder();

        System.out.println();

        Tarea tarea1 = new Tarea("Hacer la compra");
        Tarea tarea2 = new Tarea("Estudiar para el examen");

        ManagerTarea managerTarea = new ManagerTarea();

        Comando tareaCompleta1 = new ComandoTareaCompletada(tarea1);
        Comando tareaCompleta2 = new ComandoTareaCompletada(tarea2);

        ManagerTarea.ejecutarComando(tareaCompleta1);
        ManagerTarea.ejecutarComando(tareaCompleta2);

        ManagerTarea.deshacerUltimoComando();

    }
}
