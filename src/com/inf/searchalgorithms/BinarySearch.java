package com.inf.searchalgorithms;

import java.util.Arrays;

public class BinarySearch {

	public int runBinarySearchIteratively(
			  int[] sortedArray, int desiredValue, int lowerIndex, int higherIndex) {
			    int index = Integer.MAX_VALUE;
			     
			    while (lowerIndex <= higherIndex) {
			        int mid = (lowerIndex + higherIndex) / 2;
			        if (sortedArray[mid] < desiredValue) {
			            lowerIndex = mid + 1;
			        } else if (sortedArray[mid] > desiredValue) {
			            higherIndex = mid - 1;
			        } else if (sortedArray[mid] == desiredValue) {
			            index = mid;
			            break;
			        }
			    }
			    return index;
			}
	
	public static void main(String[] args) {
		// Executing binary search.
		int [] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		Arrays.sort(myArray);
		BinarySearch bsearch = new BinarySearch();
		int index = bsearch.runBinarySearchIteratively(myArray, 32, 0, 12);
		System.out.println(" Value found : " + myArray[index]+ " in index: " + index);
	}

}

