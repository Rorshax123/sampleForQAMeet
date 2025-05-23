package uz.pet.pet_api.models.user;

import lombok.Getter;

@Getter
public class CreateUserResponse {
    private Integer code;
    private String type;
    private String message;
}
