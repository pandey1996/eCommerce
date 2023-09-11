package com.eCommerce.user.Registration.Service.impl;

import com.eCommerce.user.Registration.Models.DataModels.UserInfoData;
import com.eCommerce.user.Registration.Models.Request.UserRegistrationRequest;
import com.eCommerce.user.Registration.Service.RegistrationService;
import com.eCommerce.user.Repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    UserInfoRepository userInfoRepository;
    RegistrationServiceImpl(UserInfoRepository userInfoRepository){
        this.userInfoRepository=userInfoRepository;
    }
    @Override
    public ResponseEntity<String> register(RequestEntity<UserRegistrationRequest> request) {
        try{
            userInfoRepository.save(
                    UserInfoData.builder().userName(Objects.requireNonNull(request.getBody()).getUserName())
                            .firstName(request.getBody().getFirstName())
                            .middleName(request.getBody().getMiddleName())
                            .lastName(request.getBody().getLastName())
                            .emailId(Objects.requireNonNull(request.getBody()).getEmailId())
                            .addressLine1(request.getBody().getAddressLine1())
                            .addressLine2(request.getBody().getAddressLine2())
                            .city(request.getBody().getCity()).zip(request.getBody().getZip())
                            .country(request.getBody().getCountry())
                            .mobile(request.getBody().getMobile()).build());
        }catch (Exception e){

        }
        return ResponseEntity.ok().body("User Registered Successfully");
    }
}
