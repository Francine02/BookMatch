package com.me.backend.dtos.response;

import java.sql.Date;

public record ReviewResponseDTO(
    String id,
    String userId,
    String bookId,
    String content,
    Date createdAt
) {}
