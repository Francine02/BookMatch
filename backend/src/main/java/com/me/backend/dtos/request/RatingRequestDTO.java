package com.me.backend.dtos.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record RatingRequestDTO(
    @Min(1)
    @Max(5)
    int stars,
    String comment
) {}
