package sample;

public class Main  {

    public static void main(String[] args) {
        BaseSamsaRestaurant samsarestaurant = new SamsaRestaurant();
        Samsa hensamsa = samsarestaurant.createSamsa("Hen");
        Samsa muttonsamsa = samsarestaurant.createSamsa("Mutton");
    }
}
