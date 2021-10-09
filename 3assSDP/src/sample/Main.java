package sample;

public class Main {

    public static void main(String[] args) {

        Travel travel= new Borovoe();
        travel= new attraction(travel);
        System.out.println(travel.getDescription()+travel.days()+" days");

    }
}
