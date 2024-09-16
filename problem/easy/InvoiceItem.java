package problem.easy;

public class InvoiceItem {
    public static void main(String[] args) {
        var product1 = new Product ("shampoo", 10);
        var product2 = new Product ("conditioner", 5);
        var product3 = new Product ("tooth brush", 3);

        var firstItem = new InvoiceItem(product1, 7, null);
        var secondItem = new InvoiceItem(product2, 9, null);
        var thirdItem = new InvoiceItem(product3, 10, null);

        firstItem.next = secondItem;
        secondItem.next = thirdItem;

        System.out.println((int)firstItem.getTotalPrice());
        System.out.println((int)secondItem.getTotalPrice());
        System.out.println((int)firstItem.next.getTotalPrice());
        System.out.println((int)firstItem.next.next.getTotalPrice());
        System.out.println((int)firstItem.next.product.price);
        System.out.println(firstItem.next.next.product.title);
    }

    Product product;
    int quantity;
    InvoiceItem next;

    public InvoiceItem(Product product, int quantity, InvoiceItem next) {
        this.product = product;
        this.quantity = quantity;
        this.next = next;
    }

    public double getTotalPrice() {
        return product.price * quantity;
    }
}
