package gestionTareas;

public class Tarea {
    private String name;
    private boolean completado;

    public Tarea(String name) {
        this.name = name;
        this.completado = false;
    }

    public void completo() {
        this.completado = true;
        System.out.println("La tarea '" + name + "' ha sido completada.");
    }

    public void DesmarcarTareaCompleta() {
        this.completado = false;
        System.out.println("Se ha desmarcado como completada la tarea '" + name + "'.");
    }
}
