package com.felipe.passada.domain.entities.values;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class Cellphone {
    String ddd;
    String cellNumber;

    public Cellphone(String ddd, String cellNumber) {
        if(!validatePhoneNumber(ddd + cellNumber)) {
           throw new IllegalArgumentException("Invalid cellphone number!!");
        }
        this.ddd = ddd;
        this.cellNumber = cellNumber;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        if (!phoneNumber.equals(digitsOnly)) {
            return false;
        }

        int length = digitsOnly.length();
        return (length >= 10 && length <= 11);
    }
}
