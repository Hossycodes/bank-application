package com.hossy.bankapplication.service;

import com.hossy.bankapplication.dto.BankResponse;
import com.hossy.bankapplication.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
