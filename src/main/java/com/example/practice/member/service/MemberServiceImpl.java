package com.example.practice.member.service;

import com.example.practice.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 신규 회원을 DB에 등록
     */
    @Override
    public void insertMember() {

    }
}
