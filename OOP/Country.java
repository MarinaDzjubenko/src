package OOP;

public class Country {
    //Fields
    private String name;
    private int population;
    private String capital;
    private String currency;
    private boolean inEU;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setInEU(boolean inEU) {
        this.inEU = inEU;
    }

    //Getter methods
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public String getCapital() {
        return capital;
    }
    public String getCurrency() {
        return currency;
    }
    public boolean isInEU() {
        return inEU;
    }

    public void countryInfo(){
        System.out.println("Country: " + name);
        System.out.println("Country: " + population);
        System.out.println("Country: " + capital);
        System.out.println("Country: " + currency);
        System.out.println("Country: " + inEU);
    }
    public void isThisCountryInEU(){
        if(inEU){
            System.out.println(name+ "is in EU ");
        }else{
            System.out.println(name+ " is not in EU");
        }
    }
}
