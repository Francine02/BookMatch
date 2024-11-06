package com.me.backend.dtos.request;

public record BookRequestDTO(
    String title,
    String author,
    String genre,
    String description
) {}
