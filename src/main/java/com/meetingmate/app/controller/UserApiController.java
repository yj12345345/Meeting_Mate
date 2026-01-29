package com.meetingmate.app.controller;

import com.meetingmate.app.domain.user.User;
import com.meetingmate.app.domain.user.dto.UserMeResponse;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @GetMapping("/api/user/me")
    public UserMeResponse me(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return new UserMeResponse(user);
    }
}