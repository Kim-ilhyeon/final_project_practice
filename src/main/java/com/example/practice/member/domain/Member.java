package com.example.practice.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Member {
    private int memberId;           // 회원 번호 (PK)
    private String email;           // 이메일 (아이디 겸용)
    private String password;        // 비밀번호
    private String name;            // 이름
    private int age;                // 나이
    private LocalDateTime createdAt;    // 계정 생성일자
    private LocalDateTime updatedAt;    // 정보 수정일자
    private LocalDateTime deletedAt;    // 회원 삭제 일자
}
