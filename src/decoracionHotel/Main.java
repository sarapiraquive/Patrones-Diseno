package decoracionHotel;

import decoracionHotel.decoradores.concretos.ConChocolateGourmet;
import decoracionHotel.decoradores.concretos.ConFloresFrescas;
import decoracionHotel.modelo.Habitacion;
import decoracionHotel.modelo.HabitacionBasica;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();
        System.out.println(habitacion.decorar());

        habitacion = new ConFloresFrescas(habitacion);
        System.out.println(habitacion.decorar());

        habitacion = new ConChocolateGourmet(habitacion);
        System.out.println(habitacion.decorar());
    }
}
