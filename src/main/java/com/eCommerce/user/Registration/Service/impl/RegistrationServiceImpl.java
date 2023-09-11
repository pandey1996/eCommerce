package com.eCommerce.user.Registration.Service.impl;

import com.eCommerce.user.Registration.Models.Request.UserRegistrationRequest;
import com.eCommerce.user.Registration.Service.RegistrationService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Override
    public ResponseEntity<String> register(RequestEntity<UserRegistrationRequest> request) {
        return ResponseEntity.ok().body("User Registered Successfully");
    }
}
