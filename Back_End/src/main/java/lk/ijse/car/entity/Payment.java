package lk.ijse.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Payment {
    @Id
    private String paymentId;
    private String date;
    private double amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rendId", referencedColumnName = "rendId", nullable = false)
    private Rent rentals;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id",referencedColumnName = "id", nullable = false)
    private User users;
}
