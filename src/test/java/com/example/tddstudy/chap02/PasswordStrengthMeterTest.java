package com.example.tddstudy.chap02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordStrengthMeterTest {
    @Test
    void meetsAllCriteria_Then_String() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@AB");
        Assertions.assertEquals(PasswordStrength.STRONG, result);

        PasswordStrength result2 = meter.meter("abc1!Add");
        Assertions.assertEquals(PasswordStrength.STRONG, result2);

    }
}
