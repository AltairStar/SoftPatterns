package sample;


import java.util.ArrayList;

public class MenuApplication {
    ArrayList order;
    public static void main(String[] args) {
        MenuApplication m = new MenuApplication();
        m.createOrder();
    }
    public boolean createOrder() {
        boolean orderCreated = false;
        Consumer c = new Consumer();
        order = new ArrayList();
        order.add(c.placeOrder("Chicken Samsa", 2, "tajik"));
        order.add(c.placeOrder("Samsa", 1, "uigur"));
        System.out.println(order);
        return orderCreated;
    }
}
