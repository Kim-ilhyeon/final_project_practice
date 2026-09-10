package com.example.practice.community.service;

import com.example.practice.community.dto.BoardRequestDto;
import com.example.practice.community.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;
    public BoardServiceImpl(BoardMapper boardMapper){this.boardMapper = boardMapper;}

    @Override
    public void writeBoard(BoardRequestDto boardRequestDto) {
        boardMapper.insertBoard(boardRequestDto);
    }
}
