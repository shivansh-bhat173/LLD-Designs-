package LLDDesigns.Designs.CarParking;

public class Vehicle {
    int vehicleNo;

    public Vehicle(int vehicleNo, VehicleType type) {
        this.vehicleNo = vehicleNo;
        this.type = type;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    VehicleType type;
}
