package com.hossy.bankapplication.service;

import com.hossy.bankapplication.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
