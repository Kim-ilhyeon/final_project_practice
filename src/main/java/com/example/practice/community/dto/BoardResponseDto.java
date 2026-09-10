package com.example.practice.community.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BoardResponseDto {
    private Long boardId;
    private Long memberId;
    private String title;
    private String content;
    private int count;
    private int categoryId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
