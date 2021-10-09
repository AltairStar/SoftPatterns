package sample;

public abstract class Travel {

    String decription = "Description about travel";

    public String getDescription(){
        return decription;
    }

    public abstract int days();
}
