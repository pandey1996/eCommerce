package com.eCommerce.user.Registration.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationRequest {
    private String userName;
    private String emailId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zip;
    private String country;
    private String mobile;

}
