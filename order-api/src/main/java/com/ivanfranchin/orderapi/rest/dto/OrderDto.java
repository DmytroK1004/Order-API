package com.ivanfranchin.orderapi.rest.dto;

import java.time.ZonedDateTime;

public record OrderDto(String id, String description, com.ivanfranchin.orderapi.rest.dto.OrderDto.UserDto user,
                       ZonedDateTime createdAt) {

    public record UserDto(String username) {
    }
}