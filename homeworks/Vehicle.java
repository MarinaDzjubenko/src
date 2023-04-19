package homeworks;

public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public void setFuel (float fuel) {this.fuel = fuel;}
    public void setFuelUsage (float fuelUsage) {this.fuelUsage = fuelUsage;}
    public void setPassengers (int passengers) {this.passengers = passengers;}

        public float maxDistance (){
            float maxDistance = 0;
            float fuelUsageWithDif = 0;

            fuelUsageWithDif = fuelUsage + (fuelUsage/100 * (passengers * 5));
            maxDistance = fuel /fuelUsageWithDif * 100;

            System.out.printf("Your vehicle can drive maximum of %.2f ", maxDistance, " kilometers");
            return maxDistance;
        }
    }


