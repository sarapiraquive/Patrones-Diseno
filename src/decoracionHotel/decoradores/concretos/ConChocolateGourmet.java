package decoracionHotel.decoradores.concretos;

import decoracionHotel.decoradores.base.HabitacionDecorador;
import decoracionHotel.modelo.Habitacion;

public class ConChocolateGourmet extends HabitacionDecorador {

    public ConChocolateGourmet(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String decorar() {
        return super.decorar() + ", con Chocolate Gourmet";
    }
}