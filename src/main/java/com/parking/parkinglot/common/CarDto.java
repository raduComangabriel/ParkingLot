package com.parking.parkinglot.common;

import com.parking.parkinglot.entities.Car;

import java.util.List;
import java.util.Objects;

public class CarDto {

    Long id;
    String licensePlate;
    String parkingSpot;
    String ownerName;

    public CarDto(Long id, String licensePlate, String parkingSpot, String ownerName){
        this.id=id;
        this.licensePlate=licensePlate;
        this.parkingSpot=parkingSpot;
        this.ownerName=ownerName;

    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public Long getId() {
        return id;
    }

}

