package com.me.backend.dtos.response;

import java.util.List;

public record ReadingListResponseDTO(
    List<String> bookIds
) {}
