package com.example.practice.community.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BoardRequestDto {
    private String title;
    private String content;
    private int categoryId;
}
