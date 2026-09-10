package com.example.practice.member.controller;

import com.example.practice.member.dto.MemberJoinRequest;
import com.example.practice.member.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/member")
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

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

    // 정보 입력 후 DB에 신규 회원 정보를 저장
    @PostMapping("/join")
    public String insertMember(
            @Valid @ModelAttribute MemberJoinRequest memberJoinRequest
            ) {
        try {
            memberService.insertMember(memberJoinRequest);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/error/error";
        }
        return "redirect:/member/login";
    }

}
