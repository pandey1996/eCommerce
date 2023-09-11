package com.eCommerce.user.Repository;

import com.eCommerce.user.Registration.Models.DataModels.UserInfoData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserInfoRepository extends MongoRepository<UserInfoData,String> {
    @Query("{internalUserId: '?0'}")
    UserInfoData getUserInfoDataByInternalUserId(String internalUserId);
    public long count();
}
