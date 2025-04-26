package com.example.italianbrainrotapi.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.util.List;

@Data
public class CharacterCreationDto extends BaseCharacterDto {

    @NotBlank
    @URL(protocol = "https")
    private String imageUrl;

    @NotBlank
    private List<String> motive;

    @URL(protocol = "https")
    private String backgroundMusicUrl;

    private String lore;
}
