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
public class Rent {
    @Id
    private String rendId;
    private String date;
    private String pickUpDate;
    private String returnDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "registrationNo",referencedColumnName = "registrationNo",nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "licenceno",referencedColumnName = "licenceNo")
    private Driver driver;

}
