package com.example.practice.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    // 메인 페이지로 이동하는 경로
    @GetMapping("/")
    public String mainPage() {
        return "common/main";
    }

    // 접근 권한이 없을 때 보여주는 페이지 경로
    @GetMapping("/access-denied")
    public String accessDeniedPage() {
        return "common/access-denied";
    }
}


