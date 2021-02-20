public class Futures extends Product {

    private String exchange;
    private String contractCode;
    private  int month;
    private  int year;


    private ProductPricingService productPricingService ;

    public Futures(String productID, String exchange, String contractCode, int month, int year) {
        super(productID);
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }


    @Override
    public double getPrice() {
        return ProductPricingService.price(exchange,contractCode,month,year);
    }
}
