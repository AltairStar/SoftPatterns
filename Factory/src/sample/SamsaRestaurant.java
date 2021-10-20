package sample;

public class SamsaRestaurant extends BaseSamsaRestaurant{
    @Override
    public  Samsa createSamsa(String type){
        Samsa samsa;
        switch (type.toLowerCase())
        {
            case "hen":
                samsa = new HenSamsa();
                break;
            case "mutton":
                samsa = new MuttonSamsa();
                break;

            default: throw new IllegalArgumentException("No such Samsa.");
        }

        samsa.addPotato();
        samsa.addOnion();
        samsa.addMushroom();
        samsa.makeSamsa();
        return samsa;
    }
}
