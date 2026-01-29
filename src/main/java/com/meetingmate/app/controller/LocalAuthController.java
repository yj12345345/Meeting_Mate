package com.meetingmate.app.controller;

import com.meetingmate.app.dto.auth.LocalAuthService;
import com.meetingmate.app.dto.auth.LocalLoginRequest;
import com.meetingmate.app.dto.auth.LocalSignupRequest;
import com.meetingmate.app.dto.auth.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth/local")
public class LocalAuthController {

    private final LocalAuthService localAuthService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@RequestBody LocalSignupRequest req) {
        localAuthService.signup(req);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody LocalLoginRequest req) {
        return ResponseEntity.ok(localAuthService.login(req));
    }
}