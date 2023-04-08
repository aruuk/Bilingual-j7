package com.example.bilingualj7.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    @NotNull(message = "Password must not be null!")
    @NotBlank(message = "Password must not be empty!")
    @Email(message = "@gmail.com must be!")
    private String email;

    @NotNull(message = "Password must not be null!")
    @NotBlank(message = "Password must not be null!")
    private String password;

}
