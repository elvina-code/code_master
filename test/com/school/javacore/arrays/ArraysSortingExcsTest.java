package com.school.javacore.arrays;
import org.junit.Test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysSortingExcsTest {

    ArraySortingExcs arraySortingExcs = new ArraySortingExcs();

    @Test
    public void testShuffle(){
        int [] array1 = {2,3,1,7};
        int [] array2 = {2,3,1,7};
        arraySortingExcs.shuffle(array1);
//        assertNotEquals(array1, array2);
        assertFalse(Arrays.equals(array1,array2));

         // if not shuffled, they should be equal to each other
        int [] array3 = {2,3,1,7};
        int [] array4 = {2,3,1,7};

        assertNotEquals(array3, array4);

        // if not shuffled, they should be equal to each other doesnt work assertEquals
        int [] array5 = {2,3,1,7};
        int [] array6= {2,3,1,7};

        assertArrayEquals(array5, array6);

    }
    @Test
    public void testSort(){
        int [] array = {2,3,1,7};
        int [] arrays = {1,2,3,7};

        arraySortingExcs.sort(array);
        assertTrue("after sorting must be lie in arrays", Arrays.equals(array, arrays));

        int [] array9 ={3,7,1,2};
        assertFalse("after sorting the order must nor be like araay9",Arrays.equals(array,array9));
    }


}
