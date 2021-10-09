package sample;

public class attraction extends CondimentDecorator{

    Travel travel;

    public attraction(Travel travel){
        this.travel=travel;
    }

    public String getDescription() {
        return travel.getDescription() + "with attractions ";
    }

    public int days() {
        return 1 + travel.days();
    }
}
