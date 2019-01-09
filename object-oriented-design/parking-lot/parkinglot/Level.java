package parkinglot;
/**. represents a level in a parking garage **/
public class Level {

    private int floor;
    private ParkingSpot[] spot;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;

    public Level(int floor, int numOfSpots) {
        this.floor = floor;
        spot = new ParkingSpot[numOfSpots];
        int largeSpots = numOfSpots / 4;
        int motorcycleSpots = numOfSpots / 4;
        int compactSpots = numOfSpots - largeSpots - motorcycleSpots;
        for (int i = 0; i < numOfSpots; ++i) {
            VehicleSize sz = VehicleSize.Motorcycle;
            if (i < largeSpots) {
                sz = VehicleSize.Large;
            } else if (i < largeSpot + compactSpots) {
                sz = VehicleSize.compactSpot;
            }
            int row = i / SPOTS_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, sz);
        }
        availableSpots = numOfSpots;
    }

    public int availableSpots() {
        return availableSpots;
    }

    /**. 
     * @post found a place to park vehicle
     * @return returns false if failed
     **/
    public boolean parkVehicle(Vehicle vehicle) {
        if (availableSpots() < vehicle.getSpotsNeeded()) {
            return false;
        }
        int spotNumber = findAvailableSpots(vehicle);
        if (spotNumber < 0) {
            return false;
        }
        return parkStartingAtSpot(spotNumber, vehicle);
    }

    /**.
     * @post park a vehicle starting at the spot spotNumber,
     * and continue until vehicle.spotsNeeded
     **/
    private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
        vehicle.clearSpots();
        boolean success = true;
        for (int i = spotNumber; i < spotNumber + vehicle.spotsNeeded; ++i) {
            success &= spots[i].park(vehicle);
        }
        availableSpots -= vehicle.spotsNeeded;
        return success;
    }

    /**. find a spot to park vehicle. Return index of spot,
     * or -1 on failure
     **/
    private int findAvailableSpots(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;
        for (int i = 0; i < spots.length; ++i) {
            ParkingSpot spot = spots[i];
            if (lastRow != spot.getRow()) {
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if (spot.canFitVehicle(vehicle)) {
                spotsFound++;
            } else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }


    public void print() {
        int lastRow = -1;
        for (int i = 0; i < spots.length; ++i) {
            ParkingSpot spot = spots[i];
            if (spot.getRow() != lastRow) {
                System.out.print(" ");
                lastRow = spot.getRow();
            }
            spot.print();
        }
    }

    /**. when a car was removed from a spot, increment availableSpots **/
    public void spotFreed() {
        availableSpots++;
    }
}
