package com.hossy.bankapplication.controller;

import com.hossy.bankapplication.dto.BankResponse;
import com.hossy.bankapplication.dto.UserRequest;
import com.hossy.bankapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
   @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return  userService.createAccount(userRequest);
    }

}
