package Project1;

import java.util.*;

public class ProductSorter {
    //ATTRIBUTES
    private List<Product> products = new ArrayList<>();
    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<HealthProduct> healthProducts = new ArrayList<>();
    private List<ElectricProduct> electricProducts = new ArrayList<>();

    //MY ATTRIBUTES
    private final Map<Integer, String[]> TAB = new HashMap<>() {{
        put(0, new String[]{"Apple", "Steak", "Potatoes", "Salad", "Pear"});
        put(1, new String[]{"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"});
        put(2, new String[]{"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"});
    }};
    private HashSet<Product> set = new HashSet<>();
    private int numberTimesSortCalled = 0;

    //GETTERS
    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }
    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }
    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }
    public List<Product> getProducts() {
        return products;
    }

    //SORT
    public void sortProduct(Product product){
        if(++numberTimesSortCalled != 100)
            set.add(product);
        else {
            System.out.println("sortProduct() called "+numberTimesSortCalled+"x times");
            products.addAll(set);
            products.sort(Comparator.comparingInt(Product::getProductID));

            products.stream().forEach(productFromSet -> {
                int typeOfProduct = TAB.entrySet().stream().filter(entry -> Arrays.stream(entry.getValue()).anyMatch(productFromSet.getName()::equals)).mapToInt(Map.Entry::getKey).findFirst().orElse(-1);

                switch (typeOfProduct) {
                    case 0:
                        foodProducts.add((FoodProduct) productFromSet);
                        break;
                    case 1:
                        healthProducts.add((HealthProduct) productFromSet);
                        break;
                    case 2:
                        electricProducts.add((ElectricProduct) productFromSet);
                }
            });
        }
    }

}
