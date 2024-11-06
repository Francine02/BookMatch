package com.me.backend.dtos.response;

import java.util.List;

public record UserDTO(
    List<Long> readingHistoryIds,
    List<String> preferences
) {}
