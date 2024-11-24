package com.me.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.me.backend.dtos.request.ReviewRequestDTO;
import com.me.backend.dtos.response.ReviewResponseDTO;
import com.me.backend.models.Review;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    // De dto para entidade
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Review review(ReviewRequestDTO reviewRequestDTO);

    // De entidade para dto
    ReviewResponseDTO toResponseDTO(Review review);
}
