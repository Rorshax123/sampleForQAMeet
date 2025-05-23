package uz.pet.pet_api.models.user;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateUserRequest {
    private Integer id;
    private Integer userStatus;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

}
