package com.example.bilingualj7.api;

import com.example.bilingualj7.db.service.UserService;
import com.example.bilingualj7.dto.requests.AuthRequest;
import com.example.bilingualj7.dto.requests.SignUpRequest;
import com.example.bilingualj7.dto.responses.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationApi {

    private final UserService userService;

    @PostMapping("/signup")
    public AuthResponse singUp(@RequestBody @Valid SignUpRequest request) {
        return userService.signUp(request);
    }

    @PostMapping("/login")
    public AuthResponse singUp(@RequestBody @Valid AuthRequest request) {
        return userService.signIn(request);
    }

}
