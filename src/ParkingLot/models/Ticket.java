package ParkingLot.models;

import ParkingLot.models.enums.VehicleType;

import java.util.Date;

public class Ticket {
    private Date entryTime;
    private Gate gate;
    private Operator operator;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
}
