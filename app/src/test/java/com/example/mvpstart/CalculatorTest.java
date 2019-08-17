package com.example.mvpstart;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator testSubject = new Calculator();

    @Test
    public void GivenInputIs0_WhenFeatureOneIsCalled_Return0AsResult() {
        // Given
        String input = "0";
        int expected = 0;

        // When
        int result = testSubject.featureOne(input);

        // Then
        Assert.assertEquals(result, expected);
    }

    @Test
    public void GivenInputIsNeg1_WhenFeatureOneIsCalled_ReturnNeg10AsResult() {
        // Given
        String input = "-1";
        int expected = -10;

        // When
        int result = testSubject.featureOne(input);

        // Then
        Assert.assertEquals(result, expected);
    }

    @Test
    public void GivenInputIsString_WhenFeatureOneIsCalled_Return0AsResult() {
        // Given
        String input = "Hello World";
        int expected = 0;

        // When
        int result = testSubject.featureOne(input);

        // Then
        Assert.assertEquals(result, expected);
    }
}
