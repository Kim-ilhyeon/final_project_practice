package com.example.practice.community.mapper;

import com.example.practice.community.dto.BoardRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insertBoard(BoardRequestDto boardRequestDto);
    BoardRequestDto selectBoardById(Long boardId);
}
