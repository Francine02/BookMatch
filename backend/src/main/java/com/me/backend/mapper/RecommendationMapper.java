package com.me.backend.mapper;

import org.mapstruct.Mapper;

import com.me.backend.dtos.response.RecommendationResponseDTO;
import com.me.backend.models.Recommendation;

@Mapper(componentModel = "spring")
public interface RecommendationMapper {
    // De entidade para dto
    RecommendationResponseDTO toResponseDTO(Recommendation recommendation);
}
