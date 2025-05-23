package uz.pet.tests.pet_api;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;

import uz.pet.pet_api.models.user.CreateUserRequest;
import uz.pet.pet_api.models.user.CreateUserResponse;
import uz.pet.pet_api.services.user.UserService;

@SpringBootTest
public class UserTests {
    @Autowired
    UserService userService;

    @Test
    void createUserTest() {
        step("Запрос на создание пользователя", () -> {
            var request = CreateUserRequest.builder()
                    .id(0)
                    .username("TestUz")
                    .firstName("FirstTestName")
                    .lastName("LastUserName")
                    .email("test@mail.ru")
                    .password("testPassword")
                    .phone("998901234567")
                    .userStatus(0)
                    .build();
            CreateUserResponse response = userService.createUser(request);

            step(
                    "Проверка ответа",
                    () ->{
                        assertThat(response.getCode()).isEqualTo(200);
                        assertThat(response.getType()).isEqualTo("unknown");
                        assertThat(response.getMessage()).isNotEmpty();
                    } );
        });
    }
}
