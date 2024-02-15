package gestionTareas;

public class ComandoTareaCompletada implements Comando {
    private Tarea tarea;

    public ComandoTareaCompletada(Tarea tarea) {
        this.tarea = tarea;
    }

    public void execute() {
        tarea.completo();
    }

    public void undo() {
        tarea.DesmarcarTareaCompleta();
    }
}
