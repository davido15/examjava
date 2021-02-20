public class Stocks extends Product {

    String exchange;
    String ticker;

    public Stocks(String hoou, String productID) {
        super(productID);
    }


    public String getExchange() {
        return exchange;
    }
    @Override
    public double getPrice() {
        final double price = ProductPricingService.price(exchange, ticker);
        return price;
    }
}
