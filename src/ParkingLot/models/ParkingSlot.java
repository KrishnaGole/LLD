package ParkingLot.models;

import ParkingLot.models.enums.ParkingSlotStatus;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<Vehicle> supportedVehicleTypes;
}
