package com.me.backend.dtos.request;

import java.util.List;

public record ReadingListRequestDTO(
    List<Long> bookIds
) {}
