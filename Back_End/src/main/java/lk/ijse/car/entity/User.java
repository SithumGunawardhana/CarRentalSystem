package lk.ijse.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String nic;
    private String address;
    private String contact;
    private String email;
    private String password;


    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<Rent> rentals=new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Payment> payments=new ArrayList<>();

}
