package com.example.practice.member.service;

import com.example.practice.member.dto.MemberJoinRequest;
import com.example.practice.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    private final PasswordEncoder passwordEncoder;

    public MemberServiceImpl(MemberMapper memberMapper, PasswordEncoder passwordEncoder) {
        this.memberMapper = memberMapper;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * 신규 회원을 DB에 등록 (회원가입)
     */
    @Override
    public void insertMember(MemberJoinRequest memberJoinRequest) {
        // 비밀번호 암호화
        String encodedPwd = encodePwd(memberJoinRequest.getPassword());
        memberJoinRequest.setPassword(encodedPwd);

        int result = memberMapper.insertMember(memberJoinRequest);
        
        if (result != 1) {
            // TODO: 회원가입이 1행이 되지 않은 경우 예외처리 및 예외 던지기
            return;
        }
    }

    /**
     * 비밀번호를 전달받아 암호화 후 반환하는 메소드 분리
     * @param pwd
     * @return
     */
    private String encodePwd(String pwd) {
        return passwordEncoder.encode(pwd);
    }
}
