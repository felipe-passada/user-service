package com.felipe.passada.domain.entities.values;


import com.felipe.passada.domain.entities.values.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void ShouldThrowWhenInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> new Email("banana"));
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
    }

    @Test
    void ShouldPassWhenValidEmail() {
       Email email = new Email("user@email.com");

       assertEquals("user@email.com", email.getAddress());
    }
}
