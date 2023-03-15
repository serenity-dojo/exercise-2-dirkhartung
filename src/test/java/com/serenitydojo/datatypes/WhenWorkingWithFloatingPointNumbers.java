package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: fahrenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFahrenheit() {
        final double celcius = 27.0d;
        double fahrenheit;

        // Use a floating point calculation to calculate the Fahrenheit equivalent of the Celcius value.
        fahrenheit = 9 * celcius / 5 + 32;

        assertThat(fahrenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertMetersToFeet() {
        final int weightInKilograms = 50;
        double weightInPounds;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds
        weightInPounds = weightInKilograms * 2.20462;

        assertThat(weightInPounds, equalTo(110.231));

    }
}
