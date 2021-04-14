import java.io.FileNotFoundException;
import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        //do stuff

        Menu menu = null;
        try {
            menu = new Menu();
        } catch (FileNotFoundException e) {
            System.out.println("woops");
        }
        System.out.println(menu);

        System.out.println(menu.getPizza(6));

        System.out.printf("%-50.50s %-50.50s%n", "Column 1", "Column 2");


        // Add loop to keep adding pizzas

        Order order1 = new Order();

        order1.addComment();
        order1.pickUpTime();

        order1.addPizza(menu.getPizza(5), 1);
        order1.addPizza(menu.getPizza(14),3);

        System.out.println(order1.list);
        System.out.println("Total price: " + order1.getTotalPrice() + " DKK");

    }

}