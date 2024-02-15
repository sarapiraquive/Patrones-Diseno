package creacionRestaurante.builder;

import creacionRestaurante.model.Menu;

public interface MenuBuilder {
    void buildEntrada(String entrada);
    void buildPlatoPrincipal(String platoPrincipal);
    void buildPostre(String postre);
    void buildBebida(String bebida);
    Menu getMenu();
}
