package uz.pet.pet_api.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pet.pet_api.PetApiRequestSpecification;
import uz.pet.pet_api.models.user.CreateUserRequest;
import uz.pet.pet_api.models.user.CreateUserResponse;

@Service
public class UserService {
    @Autowired
    PetApiRequestSpecification reqSpec;

    public CreateUserResponse createUser(CreateUserRequest request) {
        return reqSpec.getRequestSpecification()
            .body(request)
            .post("/user")
            .as(CreateUserResponse.class);
    }

}
