package lk.ijse.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LoginDTO {
    private String loginId;
    private String userName;
    private String password;
    private String role;
}
