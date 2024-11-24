package com.me.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.me.backend.dtos.request.LoginRequestDTO;
import com.me.backend.dtos.request.RegisterRequestDTO;
import com.me.backend.dtos.response.UserResponseDTO;
import com.me.backend.models.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // De dto para entidade
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", ignore = true)
    User toUser(LoginRequestDTO loginRequestDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ratingIds", ignore = true)
    @Mapping(target = "reviewIds", ignore = true)
    User toUser(RegisterRequestDTO registerRequestDTO);

    // De entidade para dto
    UserResponseDTO toResponseDTO(User user);
}
