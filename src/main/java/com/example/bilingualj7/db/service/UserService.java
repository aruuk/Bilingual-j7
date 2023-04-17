package com.example.bilingualj7.db.service;

import com.example.bilingualj7.dto.requests.AuthRequest;
import com.example.bilingualj7.dto.requests.SignUpRequest;
import com.example.bilingualj7.dto.responses.AuthResponse;

public interface UserService {

    AuthResponse signUp(SignUpRequest signUpRequest);

    AuthResponse signIn(AuthRequest authRequest);

}
