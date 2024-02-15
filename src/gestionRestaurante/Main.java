package gestionRestaurante;

public class Main {

    public static void main(String[] args) {

        gestionRestaurante foodOrder = new OrderFood();
        foodOrder.processOrder();

        gestionRestaurante beverageOrder = new OrderBeverage();
        beverageOrder.processOrder();

        gestionRestaurante dessertOrder = new OrderDessert();
        dessertOrder.processOrder();

        System.out.println();
    }
}
