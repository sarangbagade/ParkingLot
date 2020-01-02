package com.ParkingLot.Models.parking;

import com.ParkingLot.DBObject;
import java.time.LocalDateTime;

public class Ticket extends DBObject {

    private TicketStatus status;
    private LocalDateTime issuedTime;

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public LocalDateTime getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(LocalDateTime issuedTime) {
        this.issuedTime = issuedTime;
    }
}
