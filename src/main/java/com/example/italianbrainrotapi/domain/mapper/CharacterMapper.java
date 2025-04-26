package com.example.italianbrainrotapi.domain.mapper;

import com.example.italianbrainrotapi.domain.dto.CharacterCreationDto;
import com.example.italianbrainrotapi.domain.dto.CharacterDto;
import com.example.italianbrainrotapi.domain.dto.CharacterUpdateDto;
import com.example.italianbrainrotapi.domain.entity.Character;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CharacterMapper {

    Character characterDtoToCharacter(CharacterDto characterDto);

    CharacterDto characterToCharacterDto(Character character);

    Character characterCreateDtoToCharacter(CharacterCreationDto characterCreationDto);

    void updateCharacterFromCharacterDto(CharacterUpdateDto characterUpdateDto, @MappingTarget Character character);

    List<CharacterDto> characterListToCharacterDtoList(List<Character> characterList);
}
