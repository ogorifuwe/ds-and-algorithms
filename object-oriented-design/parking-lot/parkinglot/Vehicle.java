package parkinglot;

import java.util.ArrayList;

public abstract class Vehicle {

    protected ArrayList<ParkingSpot> parkingSpots =
        new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotNeeded() { return spotsNeeded; }

    public VehicleSize getSize() { return size; }

    /**. park vehicle in this spot (among other, potentially) **/
    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    /**. remove car from spot, and notify spot that it's gone **/
    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); ++i) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    /**. checks if the spot is big enough for the vehicle (and is
     * availabl). This compares the SIZE only. It does not check if
     * it has enough spots.
     **/
    public abstract boolean canFitInSpot(ParkingSpot spot);
    public abstract void print();
}
