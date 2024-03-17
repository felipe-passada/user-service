package com.felipe.passada.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private Email email;

    private String firstName;

    private String lastName;

    private Cellphone cellphone;

    private List<PriceAlert> priceAlerts = new ArrayList<>();
}