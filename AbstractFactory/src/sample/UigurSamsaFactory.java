package sample;

public class UigurSamsaFactory extends AbstractSamsaFactory{
    @Override
    public AbstractSamsa placeOrder(String itemName, int quantity) {
        return new UigurSamsa(itemName,quantity);
    }
}
