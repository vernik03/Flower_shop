package com.flowers.big;

import com.flower_shop.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigFlowerTest {

    BigFlower bigFlower = new BigFlower(Color.RED, 100, "2022-09-26");

    @Test
    void setHeightNormal() {
        BigFlower bigFlower = new BigFlower(Color.RED, 100, "2022-09-26");
        assertEquals(100, bigFlower.getHeight());
    }

    @Test
    void setHeightException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> bigFlower.setHeight(50));
        assertEquals("Height is not valid", exception.getMessage());
    }
}