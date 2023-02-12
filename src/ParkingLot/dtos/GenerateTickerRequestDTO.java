package ParkingLot.dtos;

import ParkingLot.models.Vehicle;
import ParkingLot.models.enums.VehicleType;

public class GenerateTickerRequestDTO {
    private Long gateId;
    // the vehicle might be visiting the parking lot for the first time and hence not in db
    private String vehicleNumber;
    private VehicleType vehicleType;
}
