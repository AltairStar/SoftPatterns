package sample;

public class TajikSamsaFactory extends AbstractSamsaFactory{
    @Override
    public AbstractSamsa placeOrder(String itemName, int quantity) {
        return new TajikSamsa(itemName,quantity);
    }
}
