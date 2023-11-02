package lk.ijse.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Driver {
    @Id
    private String licenceNo;
    private String name;
    private String address;
    private String contactNo;
    private String nicNo;
    private String userName;
    private String password;


    @OneToMany(mappedBy = "driver" ,cascade = CascadeType.ALL)
    private List<Rent> rentals=new ArrayList<>();

}
