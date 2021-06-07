package com.company;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() {
        System.out.println("setup is running");
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoPositiveIntegers(){
        assertEquals(3, calculator.addInts(1,2));
        assertEquals(10, calculator.addInts(4,6));
    }


    @Test
    public void shouldAddTwoPositiveDoubles(){
        assertEquals(3.5, calculator.addDoubles(1.2,2.3));
        assertEquals(10.5, calculator.addDoubles(4.3,6.2));
    }


    @Test
    public void shouldSubtractTwoPositiveIntegers(){
        assertEquals(5, calculator.subtractInts(10, 5));
        assertEquals(12, calculator.subtractInts(20,8));
    }

    @Test
    public void shouldSubtractTwoPositiveDoubles(){
        assertEquals(1.4000000000000004, calculator.subtractDoubles(5.2, 3.8));
        assertEquals(1.9, calculator.subtractDoubles(4.3,2.4));
    }

    @Test
    public void shouldDivideTwoPositiveIntegers(){
        assertEquals(3, calculator.divideInts(12, 4));
        assertEquals(5, calculator.divideInts(25,5));
        assertEquals(0, calculator.divideInts(16,0));
    }

    @Test
    public void shouldDivideTwoPositiveDoubles(){
        assertEquals(2.5, calculator.divideDoubles(10, 4));
        assertEquals(5.200000000000001, calculator.divideDoubles(19.76,3.8));
        assertEquals(0, calculator.divideDoubles(12.5,0));
    }

    @Test
    public void shouldMultiplyTwoPositiveIntegers(){
        assertEquals(15, calculator.multiplyInts(5, 3));
        assertEquals(72, calculator.multiplyInts(6,12));
    }

    @Test
    public void shouldMultiplyTwoPositiveDoubles(){
        assertEquals(19.759999999999998, calculator.multiplyDoubles(5.2, 3.8));
        assertEquals(10.319999999999999, calculator.multiplyDoubles(4.3,2.4));
    }

}
