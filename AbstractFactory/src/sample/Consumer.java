package sample;

public class Consumer {
    public AbstractSamsa placeOrder(String itemName,int quantity,String itemType) {
        AbstractSamsaFactory a = null;
        if(itemType.equals("italian")) {
            a = new UigurSamsaFactory();
        }else if(itemType.equals("mexican")) {
            a = new TajikSamsaFactory();
        }
        if(a!=null) {
             return  a.placeOrder(itemName, quantity);
        }else {
            return null;
        }
    }
}