public class Futures extends Product{
         String exchange;
         String contractCode;
         int month;
         int year;

    public Futures(String product_Id, double price, String exchange, String contractCode, int month, int year) {
        super(product_Id, price);
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }
}
