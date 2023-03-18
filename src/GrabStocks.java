public class GrabStocks {
    public static void main(String[] args) throws Exception {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver o1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setGOOGPrice(417.00);
        stockGrabber.setAAPLPrice(397.00);
        StockObserver o2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(297.00);
        stockGrabber.setGOOGPrice(417.00);
        stockGrabber.setAAPLPrice(397.00);

        stockGrabber.unregister(o2);
    }
}
