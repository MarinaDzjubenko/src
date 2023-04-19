package OOP.Interfaces;

interface Bug {
    // public final String name = "Test";
    public void bugSound();
    public void bugSize();
}
interface Location{
    public void location();
}

class Ant implements Bug, Location{
    public void bugSound() {
        System.out.println("tsss");
    }
    public void bugSize() {
        System.out.println("Small");
    }
    public void location (){
        System.out.println("Forest");
}
public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSound();
    }

    }
}
