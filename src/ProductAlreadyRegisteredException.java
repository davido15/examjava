import org.omg.CORBA.SystemException;

public class ProductAlreadyRegisteredException extends Exception {
    public ProductAlreadyRegisteredException(){
        System.out.println("the product exist already");
    }
}
