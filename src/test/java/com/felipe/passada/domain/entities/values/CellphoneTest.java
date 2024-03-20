package com.felipe.passada.domain.entities.values;

import com.felipe.passada.domain.entities.values.Cellphone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellphoneTest {
    @Test
    void ShouldThrowWhenInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> new Cellphone("011", "8797"));
        assertThrows(IllegalArgumentException.class, () -> new Cellphone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Cellphone("", ""));
    }

    @Test
    void ShouldPassWhenValidEmail() {
        Cellphone phone = new Cellphone("11", "901982350");

        assertEquals("11", phone.getDdd());
        assertEquals("901982350", phone.getCellNumber());
    }

}