package com.example.practice.member.mapper;

import com.example.practice.member.dto.MemberJoinRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    // 회원가입
    int insertMember(MemberJoinRequest memberJoinRequest);
}
