import static org.junit.jupiter.api.Assertions.*;

class MontrealTradedProductsImplTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void addNewProduct() {
        Product addstock = new Stocks("hoou","hj");
        Product addstockagain = new Stocks("hoou","hj");

        Product addfuture = new Futures("ffff","6777","6hhh",2,2008);
        Product addfutureagain = new Futures("ffff","6777","6hhh",2,2008);
        if (!MontrealTradedProductsImpl.addNewProduct(addfuture)) throw new AssertionError();
   
    }

    @org.junit.jupiter.api.Test
    void testAddNewProduct() {
    }
}