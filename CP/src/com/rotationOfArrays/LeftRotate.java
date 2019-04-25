package com.rotationOfArrays;

    /*
    *   Reversal algorithm for Array Rotation
    *   Time Complexity: O(n)
    *   link: https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
    */

public class LeftRotate {
    void leftRotate(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }
    private void reverseArray(int[] arr, int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
