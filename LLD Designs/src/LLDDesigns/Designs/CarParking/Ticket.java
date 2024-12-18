package LLDDesigns.Designs.CarParking;

import LLDDesigns.Designs.CarParking.ParkingSpot.ParkingSpot;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingspot;

    public Ticket( Vehicle vehicle, ParkingSpot parkingspot) {
        long entry = System.currentTimeMillis();
        this.entryTime = entry;
        this.vehicle = vehicle;
        this.parkingspot = parkingspot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingspot() {
        return parkingspot;
    }

    public void setParkingspot(ParkingSpot parkingspot) {
        this.parkingspot = parkingspot;
    }
}
