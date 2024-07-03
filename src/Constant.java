public class Constant {
    public static void main(String[] args) {
    double latte = 3.00;
    double mocha = 4.50;
    double chai = 2.50;

    double subtotal = 0.0;
    double totalSale = 0.0;

    subtotal = (3 * latte) + (4 * mocha) + (2 * chai);

    final double SALES_TAX = 8.875;
    totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.println("Subtotal:" +subtotal);

        System.out.println("Total Sale:" +totalSale);

    }
}
