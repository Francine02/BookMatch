package com.me.backend.dtos.response;

public record RatingResponseDTO(
    String id,
    String bookId,
    int stars,
    String comment
) {}
