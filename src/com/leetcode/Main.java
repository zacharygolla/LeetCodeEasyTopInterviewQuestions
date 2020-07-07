package com.leetcode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    ArrayEasy arrayEasy = new ArrayEasy();
	    System.out.println(arrayEasy.removeDuplicates(new int[] {1, 1, 2}));
        System.out.println(arrayEasy.maxProfit(new int [] {7,1,5,3,6,4}));
        System.out.println(Arrays.toString(arrayEasy.twoSum(new int [] {2,7,11,15}, 9)));
    }
}
