package com.example.practice.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/member")
public class MemberController {

    // 로그인 페이지로 이동하는 경로
    @GetMapping("/login")
    public String loginPage(){
        return "member/login";
    }

    // 로그아웃 후 메인 페이지로 이동하는 경로
    @GetMapping("/logout")
    public String logout(){
        return "redirect:/";
    }

    // 회원가입 페이지로 이동하는 경로
    @GetMapping("/join")
    public String joinPage(){
        return "member/join";
    }

    // 회원탈퇴 페이지로 이동하는 경로
    @GetMapping("/withdraw")
    public String withdrawPage(){
        return "member/withdraw";
    }

    // 아이디 찾기 페이지로 이동하는 경로
    @GetMapping("/find-id")
    public String findIdPage(){
        return "member/find_id";
    }

    // 비밀번호 찾기 페이지로 이동하는 경로
    @GetMapping("/find-password")
    public String findPasswordPage(){
        return "member/find_password";
    }

    // 회원 마이페이지로 이동하는 경로
    @GetMapping("/mypage")
    public String myPage(){
        return "member/mypage";
    }

    // 회원정보 수정 페이지로 이동하는 경로
    @GetMapping("/edit")
    public String editPage(){
        return "member/edit";
    }

}
