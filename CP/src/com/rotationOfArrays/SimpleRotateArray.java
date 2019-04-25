package com.rotationOfArrays;

import com.randomCodes.GreatestCommonDivisor;

public class SimpleRotateArray {

    /*
    *   Rotate the array to the left by 'd' positions to the left
    *   Uses the juggling way of rotating
    *   Time Complexity: O(n)
    *   Auxiliary Space: O(1)
    *   link: https://www.geeksforgeeks.org/array-rotation/
    */

    public void rotateArraytoLeftBy(int[] arr, int d, int n) {
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        int i, j, k, temp;
        for (i = 0; i < obj.calcGCD(d, n); i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
}
