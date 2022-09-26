package com.flowers.middle;

import com.flower_shop.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleFlowerTest {

        MiddleFlower middleFlower = new MiddleFlower(Color.RED, 50, "2022-09-26");

        @Test
        void setHeightNormal() {
            MiddleFlower middleFlower = new MiddleFlower(Color.RED, 50, "2022-09-26");
            assertEquals(50, middleFlower.getHeight());
        }

        @Test
        void setHeightException() {
            Throwable exception = assertThrows(IllegalArgumentException.class, () -> middleFlower.setHeight(120));
            assertEquals("Height is not valid", exception.getMessage());
        }

}