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
public class RepairDTO {
    private String maintenanceId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    private String details;
    private CarDTO car;
    private double cost;

}
