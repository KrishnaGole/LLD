package ParkingLot.dtos;

import ParkingLot.models.Ticket;

public class GenerateTicketResponseDTO {
    private ResponseStatus responseStatus;
    private String message;
    private Ticket ticket;
}
