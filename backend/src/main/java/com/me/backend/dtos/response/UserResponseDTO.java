package com.me.backend.dtos.response;

import java.util.List;

public record UserResponseDTO(
    List<Long> readingHistoryIds,
    List<String> preferences
) {}
