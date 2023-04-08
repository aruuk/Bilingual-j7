package com.example.bilingualj7.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    private Long id;

    private String firstname;

    private String lastname;

    private String email;

    private String role;

    private String token;

}
