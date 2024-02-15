package decoracionHotel.modelo;

import decoracionHotel.modelo.Habitacion;

public class HabitacionBasica implements Habitacion {
    @Override
    public String decorar() {
        return "Habitacion Basica";
    }
}
