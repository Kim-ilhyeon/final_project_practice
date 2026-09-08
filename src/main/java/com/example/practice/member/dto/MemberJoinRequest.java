package com.example.practice.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MemberJoinRequest {
    @NotBlank(message = "이메일은 필수입니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;       // 이메일(아이디 겸용)

    @NotBlank(message = "비밀번호는 필수입니다.")
    @Pattern(
            regexp = "^(?=.*[A-Za-z])(?=.*\\d).{8,20}$",
            message = "비밀번호는 영문과 숫자를 포함한 8~20자리여야 합니다."
    )
    private String password;    // 비밀번호

    @NotBlank(message = "이름은 필수입니다.")
    @Size(min = 2, max = 10)
    private String name;        // 이름
    private int age;            // 나이
}
