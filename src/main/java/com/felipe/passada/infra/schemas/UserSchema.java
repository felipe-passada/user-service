package com.felipe.passada.infra.schemas;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER", schema = "public")
public class UserSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "fistName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "cellphone")
    private String cellphone;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PriceAlertsSchema> priceAlerts = new ArrayList<>();


}
