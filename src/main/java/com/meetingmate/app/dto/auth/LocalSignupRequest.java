package com.meetingmate.app.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LocalSignupRequest {
    private String email;
    private String password;
    private String nickname;
}