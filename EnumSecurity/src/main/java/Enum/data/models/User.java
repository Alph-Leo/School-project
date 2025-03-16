package Enum.data.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
public class User {
    @Id
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
    private String password;
    private boolean isActive;
    private Address address;
    private String phoneNumber;


}
