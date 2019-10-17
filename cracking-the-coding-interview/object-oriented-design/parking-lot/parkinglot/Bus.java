package parkinglot;

public class Bus extends Vehicle {

    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    //@override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

    //@override
    public void print() {
        System.out.print("B");
    }
}
