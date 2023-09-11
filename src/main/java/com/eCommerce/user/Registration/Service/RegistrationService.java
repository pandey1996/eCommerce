package com.eCommerce.user.Registration.Service;

import com.eCommerce.user.Registration.Models.Request.UserRegistrationRequest;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {
    ResponseEntity<String> register(RequestEntity<UserRegistrationRequest> request);
}
