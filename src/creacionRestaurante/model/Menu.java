package creacionRestaurante.model;

public class Menu {
    private String entrada;
    private String platoPrincipal;
    private String postre;
    private String bebida;

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "entrada='" + entrada + '\'' +
                ", platoPrincipal='" + platoPrincipal + '\'' +
                ", postre='" + postre + '\'' +
                ", bebida='" + bebida + '\'' +
                '}';
    }
}
