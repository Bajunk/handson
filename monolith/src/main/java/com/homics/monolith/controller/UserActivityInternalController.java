package com.homics.monolith.controller;

import com.homics.monolith.controller.dto.UserActivityDto;
import com.homics.monolith.service.UserActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mono/internal/user")
public class UserActivityInternalController {

    // TODO 1.2.3:
    //  Clean the code in monolith by removing this file
    //  We don't need any controller for user since we have the microservice

    private UserActivityService userActivityService;

    public UserActivityInternalController(UserActivityService userActivityService) {
        this.userActivityService = userActivityService;
    }

    @GetMapping("/activity")
    private List<UserActivityDto> getActivities() {
        return userActivityService.getUserActivities();
    }
}