package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class UserService {

    @Autowired
    private OtpService otpService;

    public void registerUser(UserRegistrationRequest request) throws MessagingException {
        // Save user to database (pseudo-code)
        // userRepository.save(request);

        // Send OTP
        String otp = otpService.generateOtp();
        otpService.sendOtp(request.getEmail(), otp);
    }

    public void verifyOtp(String email, String otp) {
        // Validate OTP (pseudo-code)
        // if (!otpService.isValidOtp(email, otp)) throw new Exception("Invalid OTP");

        // Proceed with user activation (pseudo-code)
        // userRepository.activateUser(email);
    }
}
