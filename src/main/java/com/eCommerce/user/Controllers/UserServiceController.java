package com.eCommerce.user.Controllers;

import com.eCommerce.user.Registration.Models.Request.UserRegistrationRequest;
import com.eCommerce.user.Registration.Service.RegistrationService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.text.html.parser.Entity;
import java.net.http.HttpResponse;

@Controller("/user")
public class UserServiceController {
    private final RegistrationService registrationService;
    UserServiceController(RegistrationService registrationService){
        this.registrationService=registrationService;
    }
    @PostMapping("/register")
    public ResponseEntity<String> register(RequestEntity<UserRegistrationRequest> request){
        return registrationService.register(request);
    }
}
