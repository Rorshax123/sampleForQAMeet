package uz.pet.pet_api.models.pet;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class AddPetReqAndResponse {
    private Long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;

    @Getter
    @Builder
    public static class Category {
        private Integer id;
        private String name;
    }

    @Getter
    @Builder
    public static class Tag {
        private Integer id;
        private String name;
    }
}
