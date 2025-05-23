package uz.pet.tests.pet_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.pet.pet_api.models.pet.AddPetReqAndResponse;
import uz.pet.pet_api.services.pet.PetService;

import java.util.UUID;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PetTests {
    @Autowired
    PetService petService;

    String randomText = UUID.randomUUID().toString();

    @Test
    void createUserTest() {
        step("Запрос на создание пользователя", () -> {
            var category = AddPetReqAndResponse.Category.builder().name("Dogs").id(0).build();
            var request = AddPetReqAndResponse.builder()
                .id(0L)
                .category(category)
                .name("Spike" + randomText)
                .status("available")
                .build();
            AddPetReqAndResponse response = petService.addPet(request);

            step(
                "Проверка ответа",
                () -> {
                    assertThat(response.getId()).isGreaterThan(0);
                    assertThat(response.getCategory().getId()).isEqualTo(0);
                    assertThat(response.getCategory().getName()).isEqualTo("Dogs");
                    assertThat(response.getName()).isEqualTo("Spike" + randomText);
                    assertThat(response.getStatus()).isEqualTo("available");
                });
        });
    }
}
