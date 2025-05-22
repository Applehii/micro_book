package com.quanlv.profile.mapper;

import org.mapstruct.Mapper;

import com.quanlv.profile.dto.request.ProfileCreationRequest;
import com.quanlv.profile.dto.response.UserProfileReponse;
import com.quanlv.profile.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);

    UserProfileReponse toUserProfileReponse(UserProfile entity);
}
