package com.example.practice.member.service;

import com.example.practice.member.dto.MemberJoinRequest;

public interface MemberService {

    // 회원가입
    void insertMember(MemberJoinRequest memberJoinRequest);
}
