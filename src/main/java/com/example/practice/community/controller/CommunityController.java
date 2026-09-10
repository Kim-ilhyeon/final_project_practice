package com.example.practice.community.controller;

import com.example.practice.community.dto.BoardRequestDto;
import com.example.practice.community.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/community")
public class CommunityController {

    private final BoardService boardService;
    public CommunityController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 커뮤니티 게시글 목록 페이지로 이동하는 경로
    @GetMapping("/list")
    public String communityListPage(){
        return "community/list";
    }

    // 선택한 게시글의 상세 페이지로 이동하는 경로
    @GetMapping("/detail/{boardId}")
    public String communityDetailPage(Long boardId){
        return "community/detail";
    }


    // 새 게시글 작성 페이지로 이동하는 경로
    @GetMapping("/write")
    public String communityWritePage(){
        return "community/write";
    }

    @PostMapping("/write")
    public String write(BoardRequestDto boardRequestDto){
        boardService.writeBoard(boardRequestDto);
        return "redirect:/community/list";
    }

    // 선택한 게시글의 수정 페이지로 이동하는 경로
    @GetMapping("/edit/{boardId}")
    public String communityEditPage(){
        return "community/edit";
    }
}
