public class Stocks extends Product{
        String ticker;
        String exchange;

        public Stocks(String product_Id, double price, String ticker, String exchange) {
                super(product_Id, price);
                this.ticker = ticker;
                this.exchange = exchange;
        }
}
