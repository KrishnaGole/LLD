package ParkingLot.models;

import ParkingLot.models.enums.PaymentMode;
import ParkingLot.models.enums.PaymentStatus;

public class Payment extends BaseModel {
    private Bill bill;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
