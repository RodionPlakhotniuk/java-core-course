public class Lesson04App {

    public static void main(String[] args) {

        int orederNumber = 1;
        String producte = "smartphone";
        int salesDay = 5;
        double priceForProduct = 220.971090909;
        int countProduct = 11;
        double salesPerDay = countProduct * priceForProduct;
        double salesPerPeriod = salesPerDay * salesDay;


        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n", orederNumber, producte, salesDay, salesPerPeriod, salesPerDay);


        orederNumber = 2;
        producte = "laptop";
        salesDay = 7;
        priceForProduct = 99.8747619;
        countProduct = 15;
        salesPerDay = countProduct * priceForProduct;
        salesPerPeriod = salesPerDay * salesDay;


        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n", orederNumber, producte, salesDay, salesPerPeriod, salesPerDay);
    }
}
