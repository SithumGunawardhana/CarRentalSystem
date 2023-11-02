package lk.ijse.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDTO {
    private String registrationNo;
    private String brand;
    private String type;
    private int noOfPassengers;
    private  String transmissionType;
    private String fuelType;
    private String color;
    private String frontViewImg;
    private String backViewImg;
    private String sideViewImg;
    private String internalViewImg;
    private double dailyRate;
    private double monthlyRate;
    private double freeKmForDuration;
    private double lossDamageWaiver;
    private double priceFroExtraKm;
    private double completeKm;
    private String status;
}
