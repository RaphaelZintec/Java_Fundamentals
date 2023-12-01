package Project1;

public class MainApp {
    public static void main(String[] args) {
        ProductSorter  productSorter  = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);

        productFactory.createProducts(100);

        System.out.println("TOTAL "+productSorter.getProducts().stream().count()+" products with unique ID");
        productSorter.getProducts().forEach(v-> System.out.print("\t"+v+"\n"));
        productSorter.getProducts().forEach(v-> System.out.print("\t"+v+"\n"));

        System.out.println("\nFOOD ("+productSorter.getFoodProducts().stream().count()+" products)");
        productSorter.getFoodProducts().forEach(v-> System.out.print("\t"+v+"\n"));

        System.out.println("\nHEALTH ("+productSorter.getHealthProducts().stream().count()+" products)");
        productSorter.getHealthProducts().forEach(v-> System.out.print("\t"+v+"\n"));

        System.out.println("\nELECTRIC ("+productSorter.getElectricProducts().stream().count()+" products)");
        productSorter.getElectricProducts().forEach(v-> System.out.print("\t"+v+"\n"));
    }
}
