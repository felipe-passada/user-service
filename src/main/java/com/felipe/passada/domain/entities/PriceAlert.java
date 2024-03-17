package com.felipe.passada.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriceAlert {
    private Long id;

    private Long productId;

    private Double target;

    private User user;
}
