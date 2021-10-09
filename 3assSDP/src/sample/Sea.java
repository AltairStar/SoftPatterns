package sample;

public class Sea extends CondimentDecorator{

    Travel travel;

    public Sea(Travel travel){
        this.travel=travel;
    }

    public String getDescription() {
        return travel.getDescription() + "with being on sea";
    }

    public int days() {
        return 1 + travel.days();
    }
}
