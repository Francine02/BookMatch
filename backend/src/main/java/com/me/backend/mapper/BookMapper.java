package com.me.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.me.backend.dtos.request.BookRequestDTO;
import com.me.backend.dtos.response.BookResponseDTO;
import com.me.backend.models.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {
    // De dto para entidade
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "averageRating", ignore = true) 
    @Mapping(target = "ratingIds", ignore = true) 
    @Mapping(target = "reviewIds", ignore = true)
    Book toBook(BookRequestDTO bookRequestDTO);

    // De entidade para dto
    BookResponseDTO toResponseDTO(Book book);
}
