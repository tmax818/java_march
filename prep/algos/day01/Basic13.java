package prep.algos.day01;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic13 {

/**
* Print all the integers from 1 to 255.
 * 
 */
public void Basic01(){
    for(int i = 1; i < 256; i++){
        System.out.println(i);
    }
}

/**
 * Print integers from 0 to 255, and with each integer print the sum so far.
 */
public void Basic02(){
    int sum = 0;
    for(int i = 0; i < 256; i++){
        sum += i;
        System.out.println(sum);
        System.out.println(i);
    }
}

/**
 * Given an array, find and print its largest element.
 */
public void Basic03(int[] arr){
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println(max);
}

/**
 * Create an array with all the odd integers between 1 and 255 (inclusive).
 */
public void Basic04(){
    int[] odds = new int[256/2];
    int idx = 0;
    for(int i = 0; i < 256; i++){
        if(i % 2 == 1){
            odds[idx] = i;
            idx++;
        }
    }
    System.out.println(Arrays.toString(odds));
}

public void Basic04Easy(){
    ArrayList<Integer> odds = new ArrayList<>();
    for(int i = 1; i < 256; i += 2){
        odds.add(i);
    }
    System.out.println(odds);
}

/**
 * Given an array and a value Y, count and print the number of array values greater than Y.
 */
public void Basic05(int[] arr, int y){
    int count = 0;
    for(int i = 0; i <  arr.length; i++){
        if(arr[i] > y){
            count++;
            System.out.println(arr[i]);
        }
    }
    System.out.println("count:" + count);
}

/**
 * Given an array, print the max, min and average values for that array.
 */
public void Basic06(){}

/**
 * Replace any negative array values with 'Dojo'.
 */
public void Basic07(int[] arr){
    ArrayList<Object> newArr = new ArrayList<>();
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            newArr.add("Dojo");
        } else {
            newArr.add(arr[i]);
        }
        System.out.println(newArr);
    }
}

/**
 * Print all odd integers from 1 to 255.
 */
public void Basic08(){}

/**
 * Iterate through a given array, printing each value.
 */
public void Basic09(){}

/**
 * Analyze an array’s values and print the average
 */
public void Basic10(){}

/**
 * Square each value in a given array, returning that same array with changed values
 */
public void Basic11(){}

/**
 * Return the given array, after setting any negative values to zero.
 */
public void Basic12(){}

/**
 * Given an array, move all values forward by one index, dropping the first and leaving a '0' value at the end.
 */
public void BasicLast(){}



    



    
}
