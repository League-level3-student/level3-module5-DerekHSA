package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(4, RecursionMath.recursiveDivision(12, 3));
    	assertEquals(52, RecursionMath.recursiveDivision(52, 1));
    	assertEquals(5, RecursionMath.recursiveDivision(20, 4));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(1, RecursionMath.recursivePower(1, 4));
    	assertEquals(4, RecursionMath.recursivePower(2, 2));
    	assertEquals(125, RecursionMath.recursivePower(5, 3));
    }
}
