import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddNewProductTest {
    @Test
    public void addProductTest(){
        Product product = new Product("AAi",300);
        product.setProduct(product);
        Assertions.assertNotNull(product.getProduct());
    }

    @Test
    public void totalTradeQuantity(){
        Trade trade = new Trade(300,20);
        trade.setQuantity(10);
        Assertions.assertEquals(10,trade.quantity);
    }

    @Test
    public void totalValueOfDaysTradedTest(){
        Trade trade = new Trade(300,30);
        trade.setPrice(100);
        trade.setQuantity(20);
        double totalTrade = trade.price * trade.quantity;
        Assertions.assertEquals(totalTrade, trade.price*trade.quantity );
    }



}
