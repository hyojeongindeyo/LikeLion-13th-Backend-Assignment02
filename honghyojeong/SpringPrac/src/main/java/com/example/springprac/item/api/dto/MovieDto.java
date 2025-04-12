package com.example.springprac.item.api.dto;

import lombok.Builder;

@Builder
public record MovieDto(
        Long id,
        String title,
        String genre
) {
}
