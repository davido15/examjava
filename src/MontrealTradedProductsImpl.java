import java.lang.*;
import java.util.*;



public class MontrealTradedProductsImpl implements MontrealTradedProducts {
    public  ProductPricingService productPricingService ;
    public List<Product> allProduct;


    {
        allProduct = new ArrayList<>();
    }


    HashMap<Product, Integer> productandquantity = new HashMap<Product, Integer>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {

        if(allProduct.contains(product)) {
            throw new ProductAlreadyRegisteredException();
        }
        allProduct.add(product);

    }


    @Override
    public void trade(Product product, int quantity) {
       if (allProduct.contains(product)){
           if(productandquantity.containsKey(product)) {
               productandquantity.put(product, (productandquantity.get(product) + quantity));
           }

       }
    }



    @Override
    public int totalTradeQuantityForDay() {
        Integer totalvalue;
        totalvalue = 0;
        for (Map.Entry m : productandquantity.entrySet()) {
            totalvalue = (Integer) m.getValue() + totalvalue;
        }
        return totalvalue;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
     return 0;
    }
}
