package lk.ijse.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {
    private String id;
    private String name;
    private String nic;
    private String address;
    private String contact;
    private String email;
    private String password;
}
