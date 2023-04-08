package com.example.bilingualj7.db.service.serviceimpl;

import com.example.bilingualj7.configs.jwt.JwtTokenProvider;
import com.example.bilingualj7.db.entity.Role;
import com.example.bilingualj7.db.entity.User;
import com.example.bilingualj7.db.repository.UserRepository;
import com.example.bilingualj7.db.service.UserService;
import com.example.bilingualj7.dto.requests.AuthRequest;
import com.example.bilingualj7.dto.requests.SignUpRequest;
import com.example.bilingualj7.dto.responses.AuthResponse;
import com.example.bilingualj7.dto.responses.RoleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public AuthResponse signUp(SignUpRequest signUpRequest) {
        User user = new User();
        if (!userRepository.existsByEmail(signUpRequest.getEmail())) {
            Role role = new Role();
            role.setRoleName("USER");

            user.setFirstName(signUpRequest.getFirstname());
            user.setLastName(signUpRequest.getLastname());
            user.setEmail(signUpRequest.getEmail());
            user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

            user.setRole(role);
            role.addUser(user);

            userRepository.save(user);

            return new AuthResponse(user.getId(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getEmail(),
                    new RoleResponse(user.getRole().getId(), user.getRole().getRoleName()),
                    jwtTokenProvider.createToken(user.getEmail()));

        } else {
           throw new RuntimeException();
        }
    }

    @Override
    public AuthResponse signIn(AuthRequest authRequest) {
        Optional<User> user = userRepository.findByEmail(authRequest.getEmail());

        if (passwordEncoder.matches(authRequest.getPassword(), user.get().getPassword())) {

            return new AuthResponse(user.get().getId(),
                    user.get().getFirstName(),
                    user.get().getLastName(),
                    user.get().getEmail(),
                    new RoleResponse(user.get().getRole().getId(), user.get().getRole().getRoleName()),
                    jwtTokenProvider.createToken(user.get().getEmail()));

        } else {
            throw new RuntimeException();
        }

    }

}
