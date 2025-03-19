package com.bookvault.vault.controllers;

import com.bookvault.vault.models.Admin;
import com.bookvault.vault.models.Reader;
import com.bookvault.vault.models.User;
import com.bookvault.vault.repositories.AdminRepository;
import com.bookvault.vault.repositories.ReaderRepository;
import com.bookvault.vault.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtil;

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register-reader")
    public String registerReader(@RequestBody Reader reader) {
        reader.setPassword(passwordEncoder.encode(reader.getPassword()));
        readerRepository.save(reader);
        return "Reader created successfully!";
    }

    @PostMapping("/register-admin")
    public String registerAdmin(@RequestBody Admin admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        adminRepository.save(admin);
        return "Admin created successfully!";
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
        String token = jwtUtil.generateToken(user.getEmail());

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
