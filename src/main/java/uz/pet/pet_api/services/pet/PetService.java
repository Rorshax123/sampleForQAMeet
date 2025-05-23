package uz.pet.pet_api.services.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pet.pet_api.PetApiRequestSpecification;
import uz.pet.pet_api.models.pet.AddPetReqAndResponse;

@Service
public class PetService {
    @Autowired
    PetApiRequestSpecification reqSpec;

    public AddPetReqAndResponse addPet(AddPetReqAndResponse request) {
        return reqSpec.getRequestSpecification()
            .body(request)
            .post("/pet")
            .as(AddPetReqAndResponse.class);
    }

}
