package com.eCommerce.user.Registration.Service;

import com.eCommerce.user.Registration.Models.Request.UserRegistrationRequest;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface RegistrationService {
    public ResponseEntity<String> register(RequestEntity<UserRegistrationRequest> request);
}
