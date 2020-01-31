package algorithms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    static void numbersort(Integer arr[], int n)
    {
        int l = 0, r = n-1;
        int k = 0;
        while (l < r)
        {
            while (arr[l]%2 != 0)
            {
                l++;
                k++;
            }
            while (arr[r]%2 == 0  && l<r)
                r--;

            if (l < r)
            {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

            }
        }
        Arrays.sort(arr, k, n);
        Arrays.sort(arr, 0, k, Collections.reverseOrder());

    }
    public static void main(String[] args)
    {
        Integer arr[] = {1, 7, 9, 10, 3};

        numbersort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
