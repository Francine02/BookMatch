package com.me.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.me.backend.dtos.request.ReadingListRequestDTO;
import com.me.backend.dtos.response.ReadingListResponseDTO;
import com.me.backend.models.ReadingList;

@Mapper(componentModel = "spring")
public interface ReadingListMapper {
    // De dto para entidade
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userId", ignore = true)
    ReadingList readingList(ReadingListRequestDTO readingListRequestDTO);

    // De entidade para dto
    ReadingListResponseDTO toResponseDTO(ReadingList readingList);
}
