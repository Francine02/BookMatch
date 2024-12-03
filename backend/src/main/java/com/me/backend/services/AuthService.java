package com.me.backend.services;

import com.me.backend.dtos.request.LoginRequestDTO;
import com.me.backend.dtos.request.RegisterRequestDTO;
import com.me.backend.dtos.response.AuthResponseDTO;

public interface AuthService {
    AuthResponseDTO login(LoginRequestDTO loginRequestDTO);

    AuthResponseDTO register(RegisterRequestDTO registerRequestDTO);
}
