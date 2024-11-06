package com.me.backend.dtos.response;

import java.sql.Date;

public record ReviewResponseDTO(
    Long id,
    Long userId,
    Long bookId,
    String content,
    Date createdAt
) {}
