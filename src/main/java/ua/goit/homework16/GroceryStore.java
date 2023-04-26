package ua.goit.homework16;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroceryStore {
    public Double calculateTotalCost(String basket) {
        double result = 0;
        Map<String, Long> collectMap = Arrays.stream(basket.strip().split("")).collect(Collectors.groupingBy(basketItem -> basketItem, Collectors.counting()));
        for (Products product : Products.values()) {
            String strName = product.getStrName();
            Long productCount = collectMap.get(strName);
            if (productCount != null) {
                if (product.getProductStockCount() == null) {
                    result += productCount * product.getProductPrice();
                } else {
                    int countStock = (int) (productCount / product.getProductStockCount());
                    result += countStock * product.getProductStockPrice()
                            + (productCount - countStock * product.getProductStockCount()) * product.getProductPrice();

                }
            }
        }
        return result;
    }
}
