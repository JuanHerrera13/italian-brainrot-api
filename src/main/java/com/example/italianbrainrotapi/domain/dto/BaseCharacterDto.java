package com.example.italianbrainrotapi.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;

@Data
public class BaseCharacterDto {

    @UUID
    @NotBlank
    private String characterId;
}
