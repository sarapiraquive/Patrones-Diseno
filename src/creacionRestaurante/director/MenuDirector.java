package creacionRestaurante.director;

import creacionRestaurante.builder.MenuBuilder;
import creacionRestaurante.model.Menu;

public class MenuDirector {
    private MenuBuilder builder;

    public MenuDirector(MenuBuilder builder) {
        this.builder = builder;
    }
    public void construirMenu(String entrada, String platoPrincipal, String postre, String bebida) {
        builder.buildEntrada(entrada);
        builder.buildPlatoPrincipal(platoPrincipal);
        builder.buildPostre(postre);
        builder.buildBebida(bebida);
    }

    public Menu getMenu() {
        return builder.getMenu();
    }
}
