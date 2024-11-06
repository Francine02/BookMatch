package com.me.backend.dtos.response;

public record RatingResponseDTO(
    Long id,
    Long bookId,
    int stars,
    String comment
) {}
