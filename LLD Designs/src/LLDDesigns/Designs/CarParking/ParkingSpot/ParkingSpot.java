package LLDDesigns.Designs.CarParking.ParkingSpot;

import LLDDesigns.Designs.CarParking.Vehicle;
import LLDDesigns.Designs.CarParking.VehicleType;

public class ParkingSpot {

    int spotId;
    Vehicle vehicle;
    VehicleType type;
    int price;
    boolean isEmpty;

    public ParkingSpot(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
