package homework9;

public class Main {
    public static void main(String[] args) {
        // Create Products
        Product pen = new Product(1, "Pen", "This is red pen");
        Product pencil = new Product(2, "Pencil", "This is pencil");
        Product colorBox = new Product(3, "ColorBox", "This is color box");

        // Create Order and Add Line Items
        Order order = new Order(1, "ORD#1");
        order.addItem(1, 2, pen); // Ordered of 2 quantity for pen product
        order.addItem(2, 1, pencil); // Ordered of 1 quantity for pencil product
        order.addItem(3, 5, colorBox); // Ordered of 5 quantity for colorBox product

        // Print Order detail
        System.out.println("Order ---");
        System.out.println(order);

    }
}
