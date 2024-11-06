package com.me.backend.dtos.response;

import java.util.List;

public record BookResponseDTO(
    double averageRating,
    List<Long> ratingIds,
    List<Long> reviewIds
) {}
