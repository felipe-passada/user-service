package com.felipe.passada.domain.entities.values;

import lombok.Getter;
import lombok.Value;

@Value
public class Email {

    @Getter
    String address;

    public Email(String address) {
        if(!isValidEmail(address)) {
            throw new IllegalArgumentException("Invalid Email adress!!");
        }

        this.address = address;
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        // Check if there is any character afeter the @
        String beforeAt = email.substring(0, atIndex);
        String afterAt = email.substring(atIndex + 1);
        return !beforeAt.isEmpty() && !afterAt.isEmpty();
    }
}
