package com.example.bilingualj7.db.service.serviceimpl;

import com.example.bilingualj7.db.service.UserService;
import com.example.bilingualj7.dto.requests.AuthRequest;
import com.example.bilingualj7.dto.requests.SignUpRequest;
import com.example.bilingualj7.dto.responses.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public AuthResponse signUp(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public AuthResponse signIn(AuthRequest authRequest) {
        return null;
    }

}
