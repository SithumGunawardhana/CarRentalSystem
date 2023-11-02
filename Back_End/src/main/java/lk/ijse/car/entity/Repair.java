package lk.ijse.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Repair {
    @Id
    private String maintenanceId;
    private String date;
    private String details;
    private double cost;
    @ManyToOne
    @JoinColumn(name="registrationNo",referencedColumnName = "registrationNo", nullable = false)
    private Car car;

}
