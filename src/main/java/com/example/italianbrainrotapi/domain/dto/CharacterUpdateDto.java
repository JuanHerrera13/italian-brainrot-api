package com.example.italianbrainrotapi.domain.dto;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.util.List;

@Data
public class CharacterUpdateDto extends BaseCharacterDto {

    @URL(protocol = "https")
    private String imageUrl;

    private List<String> motive;

    @URL(protocol = "https")
    private String backgroundMusicUrl;

    private String lore;
}
