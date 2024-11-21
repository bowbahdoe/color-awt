package dev.mccue.color.awt.test;

import dev.mccue.color.Color;
import dev.mccue.color.awt.AWTColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AWTColorTest {
    @Test
    public void basicColorTest() {
        var colors = Color.fastHappy(100);
        for (var color : colors) {
            var awtC = AWTColor.of(color);

            assertEquals(color.sRGB().R(), awtC.sRGB().R(), 0.01, "sRGB: R");
            assertEquals(color.sRGB().G(), awtC.sRGB().G(), 0.01, "sRGB: G");
            assertEquals(color.sRGB().B(), awtC.sRGB().B(), 0.01, "sRGB: B");

            assertEquals(color.LinearRGB().R(), awtC.LinearRGB().R(), 0.01, "sRGB: R");
            assertEquals(color.LinearRGB().G(), awtC.LinearRGB().G(), 0.01, "sRGB: G");
            assertEquals(color.LinearRGB().B(), awtC.LinearRGB().B(), 0.01, "sRGB: B");

            assertEquals(color.XYZ().X(), awtC.XYZ().X(), 0.01, "XYZ: X");
            assertEquals(color.XYZ().Y(), awtC.XYZ().Y(), 0.01, "XYZ: Y");
            assertEquals(color.XYZ().Z(), awtC.XYZ().Z(), 0.01, "XYZ: Z");
        }
    }
}
