package OOP.Abstraction;

public abstract class Pet {
    protected String color;
    protected String eat;
    protected String place;
    protected int averageAge;

    public Pet(String color, String eat, String place, int averageAge){
        this.color = color;
        this.eat = eat;
        this.place = place;
        this.averageAge = averageAge;
    }
    //Default constractor
    //public Pet(){

    public abstract void printPetInfo();

}
