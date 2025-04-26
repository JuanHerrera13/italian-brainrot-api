package com.example.italianbrainrotapi.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

@Data
public class CharacterDto {

    @UUID
    @NotBlank
    private String characterId;

    @NotBlank
    private List<String> motive;

    @URL(protocol = "https")
    private String backgroundMusic;

    private String lore;
}
