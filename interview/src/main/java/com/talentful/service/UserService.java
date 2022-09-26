package com.talentful.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import com.talentful.models.User;
import com.talentful.repos.UserRepo;

public class UserService {
    
    private UserRepo repo = new UserRepo();

    private static String hashPassword(String password) {
        try {
            // salting ommitted for simplicity
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hashedPassword);
    
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean authenticate(String username, String password) {
        User user = repo.get(username);
        String passwordHash = hashPassword(password);

        if (user == null || !passwordHash.equals(user.getPasswordHash())) {
            return false;
        } else {
            return true;
        }
    }
}
