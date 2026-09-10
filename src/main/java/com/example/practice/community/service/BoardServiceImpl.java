package com.example.practice.community.service;

import com.example.practice.community.dto.BoardDto;
import com.example.practice.community.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public void writeBoard(BoardDto boardDto) {
        boardMapper.insertBoard(boardDto);
    }

    @Override
    public void deleteBoard(Long boardId, Long memberId){
        BoardDto boardDto = new BoardDto();
        boardDto.setBoardId(boardId);
        boardDto.setMemberId(memberId);
        int result = boardMapper.deleteBoard(boardDto);

        if(result != 1){
            throw new IllegalStateException("삭제 실패");
        }
    }
}
