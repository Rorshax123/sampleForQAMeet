package uz.pet.pet_api;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Setter;
import org.springframework.stereotype.Component;
import uz.pet.BaseRequestSpecification;
import uz.pet.pet_api.Constants.URLs;

import static io.restassured.RestAssured.given;

@Setter
@Component
public class PetApiRequestSpecification extends BaseRequestSpecification {

    public RequestSpecification getRequestSpecification() {
        return given().spec(baseReqSpec)
            .contentType(ContentType.JSON)
            .baseUri(URLs.PET_URL);
    }
}
