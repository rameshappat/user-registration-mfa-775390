package com.example;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class OtpService {

    public String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    public void sendOtp(String email, String otp) throws MessagingException {
        // Implementation for sending OTP via email (pseudo-code)
        // sendEmail(email, "Your OTP", otp);
    }

    public boolean isValidOtp(String email, String otp) {
        // Validate the OTP based on the email (pseudo-code)
        // return otpRepository.isValid(email, otp);
        return true; // Placeholder
    }
}
