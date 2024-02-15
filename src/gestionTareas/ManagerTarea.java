package gestionTareas;

import java.util.Stack;

public class ManagerTarea {
    private static Stack<Comando> history = new Stack<Comando>();

    public static void ejecutarComando(Comando comando) {
        comando.execute();
        history.push(comando);
    }

    public static void deshacerUltimoComando() {
        if (!history.isEmpty()) {
            Comando comando = history.pop();
            comando.undo();
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }
}
