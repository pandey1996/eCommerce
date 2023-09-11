package com.eCommerce.user.Registration.Models.DataModels;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document("userInfoData")
public class UserInfoData {

    @Id
    private String internalUserId;
    private String externalUserId;
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
