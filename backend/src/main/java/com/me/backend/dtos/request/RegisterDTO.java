package com.me.backend.dtos.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterDTO(
    String name,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String password
) {} 