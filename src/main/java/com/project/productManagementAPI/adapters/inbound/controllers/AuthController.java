package com.project.productManagementAPI.adapters.inbound.controllers;

import com.project.productManagementAPI.adapters.outbound.repositories.UserRepository;
import com.project.productManagementAPI.domain.dto.LoginRequestDTO;
import com.project.productManagementAPI.domain.dto.LoginResponseDTO;
import com.project.productManagementAPI.domain.dto.RegisterRequestDTO;
import com.project.productManagementAPI.adapters.outbound.entities.User;

import com.project.productManagementAPI.infraestructure.security.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequestDTO body){
        User user = this.repository.findByUsername(body.username()).orElseThrow(() -> new RuntimeException("User not found"));
        if(passwordEncoder.matches(body.password(), user.getPassword())) {
            String token = this.tokenService.generateToken(user);
            return ResponseEntity.ok(new LoginResponseDTO(user.getUsername(), token));
        }
        return ResponseEntity.badRequest().build();
    }


    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequestDTO body){
        Optional<User> user = this.repository.findByUsername(body.email());

        if(user.isEmpty()) {
            User newUser = new User();
            newUser.setPassword(passwordEncoder.encode(body.password()));
            newUser.setUsername(body.email());
            newUser.setUsername(body.name());
            this.repository.save(newUser);

            String token = this.tokenService.generateToken(newUser);
            return ResponseEntity.ok(new LoginResponseDTO(newUser.getUsername(), token));
        }
        return ResponseEntity.badRequest().build();
    }
}
