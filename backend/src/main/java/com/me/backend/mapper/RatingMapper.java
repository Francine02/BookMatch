package com.me.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.me.backend.dtos.request.RatingRequestDTO;
import com.me.backend.dtos.response.RatingResponseDTO;
import com.me.backend.models.Rating;

@Mapper(componentModel = "spring")
public interface RatingMapper {
    // De dto para entidade
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "bookId", ignore = true)
    Rating toRating(RatingRequestDTO ratingRequestDTO);

    // De entidade para dto
    RatingResponseDTO toResponseDTO(Rating rating);
}
