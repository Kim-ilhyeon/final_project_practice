package com.example.practice.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/community")
public class CommunityController {

    // 커뮤니티 게시글 목록 페이지로 이동하는 경로
    @GetMapping("/list")
    public String communityListPage(){
        return "community/list";
    }

    // 선택한 게시글의 상세 페이지로 이동하는 경로
    @GetMapping("/detail/{postId}")
    public String communityDetailPage(){
        return "community/detail";
    }

    // 새 게시글 작성 페이지로 이동하는 경로
    @GetMapping("/write")
    public String communityWritePage(){
        return "community/write";
    }

    // 선택한 게시글의 수정 페이지로 이동하는 경로
    @GetMapping("/edit/{postId}")
    public String communityEditPage(){
        return "community/edit";
    }
}
