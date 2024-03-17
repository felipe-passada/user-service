package com.felipe.passada.infra.schemas;

import jakarta.persistence.*;

@Entity
@Table(name = "PRICEALERTS", schema = "public")
public class PriceAlertsSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "productId")
    private Long productId;
    @Column(name = "targetPrice")
    private Double target;
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private UserSchema user;
}
