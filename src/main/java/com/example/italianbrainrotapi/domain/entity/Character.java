package com.example.italianbrainrotapi.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "character")
public class Character {

    @Id
    private String characterId = UUID.randomUUID().toString();

    private String imageUrl;

    private List<String> motive;

    private String backgroundMusicUrl;

    private String lore;
}
