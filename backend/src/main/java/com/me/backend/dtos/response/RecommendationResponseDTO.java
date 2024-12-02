package com.me.backend.dtos.response;

import java.util.List;

public record RecommendationResponseDTO(
    List<String> recommendedBookIds
) {}
