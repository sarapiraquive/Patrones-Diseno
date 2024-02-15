package creacionRestaurante.builder;

import creacionRestaurante.model.Menu;

public class MenuItaliano implements MenuBuilder {
    private Menu menu;

    public MenuItaliano() {
        this.menu = new Menu();
    }

    @Override
    public void buildEntrada(String entrada) {
        menu.setEntrada(entrada);
    }

    @Override
    public void buildPlatoPrincipal(String platoPrincipal) {
        menu.setPlatoPrincipal(platoPrincipal);
    }

    @Override
    public void buildPostre(String postre) {
        menu.setPostre(postre);
    }

    @Override
    public void buildBebida(String bebida) {
        menu.setBebida(bebida);
    }

    @Override
    public Menu getMenu() {
        return this.menu;
    }
}
