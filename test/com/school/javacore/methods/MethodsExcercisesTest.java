package com.school.javacore.methods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MethodsExcercisesTest {
    MethodsExcercises methodsExcercises = new MethodsExcercises();
    @Test

    public void findSmallest(){
        // test if given numbers 1 2 3 method is going return 1
        int smallestNum = methodsExcercises.findSmallest(1, 2,3);
        assertEquals("Should return 1 on 1 2 3", 1, smallestNum);
        assertNotNull("the result must not be null" , smallestNum);


        int smallestNegative = methodsExcercises.findSmallest(-100, 9, -10);
        assertEquals("Should return -100", -100, smallestNegative);


        int equalNumbers = methodsExcercises.findSmallest(10, 10, 10);
        assertEquals("Should return 10", 10, equalNumbers);




    }
    @Test
    public void testLoneSum(){
        int sumNumbers = methodsExcercises.loneSum(1,2,3);
        assertEquals("should return sum", 6, sumNumbers);

        int sameNumbers = methodsExcercises.loneSum(1,1,1);
        assertEquals("should return 0", 0, sameNumbers);

        int sameTwoNumbers = methodsExcercises.loneSum(1,1,2); //
        assertEquals("should return to 3rd number not same two numbers", 2, sameTwoNumbers);

        int sameTwoNumbers2 = methodsExcercises.loneSum(1,2,2);
        assertEquals("should return to 3rd number not same two numbers", 1, sameTwoNumbers2);

    }

}
