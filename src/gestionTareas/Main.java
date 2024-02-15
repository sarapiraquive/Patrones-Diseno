package gestionTareas;

public class Main {
    public static void main(String[] args) {
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
