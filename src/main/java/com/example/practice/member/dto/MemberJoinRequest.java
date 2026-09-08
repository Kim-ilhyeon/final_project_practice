package com.example.practice.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MemberJoinRequest {
    private String email;       // 이메일(아이디 겸용)
    private String password;    // 비밀번호
    private String name;        // 이름
    private int age;            // 나이
}
