package decoracionHotel.decoradores.concretos;

import decoracionHotel.decoradores.base.HabitacionDecorador;
import decoracionHotel.modelo.Habitacion;

public class ConFloresFrescas extends HabitacionDecorador {
    public ConFloresFrescas(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String decorar() {
        return super.decorar() + ", con Flores Frescas";
    }
}
