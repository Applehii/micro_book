package com.quanlv.profile.controller;

import org.springframework.web.bind.annotation.*;

import com.quanlv.profile.dto.request.ProfileCreationRequest;
import com.quanlv.profile.dto.response.UserProfileReponse;
import com.quanlv.profile.service.UserProfileService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @PostMapping("/users")
    UserProfileReponse createProfile(@RequestBody ProfileCreationRequest request) {
        return userProfileService.createProfile(request);
    }

    @GetMapping("/users/{profileId}")
    UserProfileReponse getProfile(@PathVariable String profileId) {
        return userProfileService.getProfile(profileId);
    }
}
