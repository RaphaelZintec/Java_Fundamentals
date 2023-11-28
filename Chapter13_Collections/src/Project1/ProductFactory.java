package Project1;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;
    private String[] foodProducts       = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts     = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts   = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};


    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProducts(int amount){
        Random random = new Random();
        for (int i=0; i<amount; ++i){
            int randomProduct = random.nextInt(3);
            int randomID = random.nextInt(151);
            switch (randomProduct){
                case 0: productSorter.sortProduct(new FoodProduct(foodProducts[random.nextInt(foodProducts.length)], randomID));   break;
                case 1: productSorter.sortProduct(new HealthProduct(healthProducts[random.nextInt(healthProducts.length)], randomID)); break;
                case 2: productSorter.sortProduct(new ElectricProduct(electricProducts[random.nextInt(electricProducts.length)], randomID));
            }
        }

    }
}
