package com.me.backend.dtos.request;

import jakarta.validation.constraints.NotBlank;

public record ReviewRequestDTO(
    Long bookId,
    @NotBlank
    String content
) {}
