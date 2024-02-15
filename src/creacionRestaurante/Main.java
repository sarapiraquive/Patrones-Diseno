package creacionRestaurante;


import creacionRestaurante.builder.MenuBuilder;
import creacionRestaurante.builder.MenuItaliano;
import creacionRestaurante.director.MenuDirector;
import creacionRestaurante.model.Menu;

public class Main {
    public static void main(String[] args) {

        MenuBuilder builder = new MenuItaliano();
        MenuDirector director = new MenuDirector(builder);

        director.construirMenu("pasta carbonara", "pizza de pepperoni", "tiramisu", "vino blanco");
        Menu menu = director.getMenu();
        System.out.println(menu);

    }
}