package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private List<Gate> gates;
    private List<ParkingSlot> parkingSlots;
}
