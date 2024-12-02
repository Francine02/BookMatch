package com.me.backend.dtos.response;

import java.util.List;

public record UserResponseDTO(
    List<String> readingHistoryIds,
    List<String> preferences
) {}
