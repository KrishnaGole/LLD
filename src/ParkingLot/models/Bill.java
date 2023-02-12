package ParkingLot.models;

import java.util.Date;

public class Bill extends BaseModel {
    private Date exitTime;
    private Gate gate;
    private Operator operator;
    private Ticket ticket;
    private int fare;
}
