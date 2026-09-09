package com.example.practice.community.mapper;

import com.example.practice.community.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insertBoard(BoardDto boardDto);
    BoardDto selectBoardById(Long boardId);
}
