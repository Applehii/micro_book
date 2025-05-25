package com.devteria.identity.mapper;

import com.devteria.identity.dto.request.ProfileCreationRequest;
import com.devteria.identity.dto.request.UserCreationRequest;
import com.devteria.identity.entity.Users;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(Users user, UserCreationRequest request);
}
