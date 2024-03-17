package com.felipe.passada.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Value
@AllArgsConstructor
public class Cellphone {
    private String ddd;
    private String cellNumber;
}
