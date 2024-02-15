package gestionRestaurante;

public abstract class gestionRestaurante {
    public void processOrder() {
        tomarOrden();
        verificarDisponibilidad();
        calcularPrecio();
        preparar();
    }

    protected abstract void tomarOrden();
    protected abstract void verificarDisponibilidad();
    protected abstract void calcularPrecio();
    protected abstract void preparar();
}

class OrderFood extends gestionRestaurante {
    protected void tomarOrden() {
        System.out.println("Tomando orden de comida");
    }

    protected void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de la comida");
    }

    protected void calcularPrecio() {
        System.out.println("Calculado precio de la comida");
    }

    protected void preparar() {
        System.out.println("Preparando tu comida :)");
    }
}

class OrderBeverage extends gestionRestaurante {
    protected void tomarOrden() {
        System.out.println("Tomando orden de bebida");
    }

    protected void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de la bebida");
    }

    protected void calcularPrecio() {
        System.out.println("Calculado precio de la bebida");
    }

    protected void preparar() {
        System.out.println("Preparando tu bebida :)");
    }
}

class OrderDessert extends gestionRestaurante {
    protected void tomarOrden() {
        System.out.println("Tomando orden de postre");
    }

    protected void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de postre");
    }

    protected void calcularPrecio() {
        System.out.println("Calculando precio del postre");
    }

    protected void preparar() {
        System.out.println("Preparando tu postre");
    }
}
