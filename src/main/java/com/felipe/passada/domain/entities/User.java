package com.felipe.passada.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class User {

    private Long id;

    private Email email;

    private String firstName;

    private String lastName;

    private Cellphone cellphone;

    private List<PriceAlert> priceAlerts = new ArrayList<>();

    public User(Email email, String firstName, String lastName, Cellphone cellphone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
    }
}