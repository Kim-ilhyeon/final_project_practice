package com.example.practice.community.service;

import com.example.practice.community.dto.BoardDto;

public interface BoardService {
    void writeBoard(BoardDto boardDto);

    void deleteBoard(Long boardId, Long memberId);
}
