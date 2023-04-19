package Tasks.Carpet;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator (Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    //Method-get total
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
