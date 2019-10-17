package parkinglot;

public class Car extends Vehicle {

    public Car() {
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    //@override
    public boolean canFitInSpot(ParkingSpot spot) {
        return (spot.getSize() == VehicleSize.Compact ||
                spot.getSize() == VehicleSize.Large);
    }

    //@override
    public void print() {
        System.out.print("C");
    }
}
