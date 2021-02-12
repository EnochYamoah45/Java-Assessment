import java.util.ArrayList;
import java.util.List;

public class Product implements  MontrealTradedProducts {
    String product_Id;
    double price;
    Product product;
    int quantity;

    public String getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(String product_Id) {
        this.product_Id = product_Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Product(String product_Id, double price) {
        this.product_Id = product_Id;
        this.price = price;
    }

    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException{
        List<Product> products =new ArrayList<>();

         products.add(product);

        for (Product prod:products) {
            System.out.println(prod);

            if (prod == products){
                throw new ProductAlreadyRegisteredException("Cannot add");
            }else{
                System.out.println("Added successfully");
            }
        }

    }

    public void trade(Product product, int quantity){
        this.product=product;
        this.quantity=quantity;

        List<Product> products =new ArrayList<>();
        quantity = (int) products.stream().count();
        //System.out.println(numberOfProducts);
        if (product != products){
            System.out.println("Product not registered! Quantity not recorded.");
        }else{
            System.out.println("Quantity recorded!");
        }

    }

    public int totalTradeQuantityForDay(){
         return this.quantity;
    }

    public double totalValueOfDaysTradedProducts(){
        double totalTrade = this.price * this.quantity;
        return totalTrade;
    }

}

