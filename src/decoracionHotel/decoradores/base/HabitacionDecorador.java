package decoracionHotel.decoradores.base;

import decoracionHotel.modelo.Habitacion;

public abstract class HabitacionDecorador implements Habitacion {
    protected Habitacion habitacionDecorada;

    public HabitacionDecorador(Habitacion habitacion) {
        this.habitacionDecorada = habitacion;
    }

    @Override
    public String decorar() {
        return habitacionDecorada.decorar();
    }
}