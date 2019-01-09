package parkinglot;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    //@override
    public boolean canFitInSpot(ParkingSpot spot) {
        return true;
    }

    //@override
    public void print() {
        System.out.print("M");
    }
}
