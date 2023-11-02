package lk.ijse.car.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RentDTO {
    private String rendId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String pickUpDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String returnDate;
    private String status;
    private UserDTO user;
    private CarDTO car;
    private DriverDTO driver;
}
