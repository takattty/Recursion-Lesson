package problem.easy;

public class Product {
    final String title;
    final double price;

    Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        var product1 = new Product ("shampoo", 10);
        System.out.println(product1.title);
        System.out.println(product1.price);

        var product2 = new Product ("conditioner", 5);
        System.out.println(product2.title);
        System.out.println(product2.price);
    }
}
