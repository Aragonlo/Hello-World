package com.inf.searchalgorithms;
import java.util.Arrays;

public class BinarySearch {
    //Iterative implementation
	public int runBinarySearchIteratively(
			  int[] sortedArray, int desiredValue, int lowerIndexerIndex, int higherIndexerIndex) {
			    int index = Integer.MAX_VALUE;
			     
			    while (lowerIndexerIndex <= higherIndexerIndex) {
			        int mid = (lowerIndexerIndex + higherIndexerIndex) / 2;
			        if (sortedArray[mid] < desiredValue) {
			            lowerIndexerIndex = mid + 1;
			        } else if (sortedArray[mid] > desiredValue) {
			            higherIndexerIndex = mid - 1;
			        } else if (sortedArray[mid] == desiredValue) {
			            index = mid;
			            break;
			        }
			    }
			    return index;
			}
	
	//Recursive implementation
	public int binarySearchRecursively(
			int[] sortedArray, int desiredValue, int lowerIndex, int higherIndex) {
			    int middle = (lowerIndex + higherIndex) / 2;
			         
			    if (higherIndex < lowerIndex) {
			        return -1;
			    }
			    if (desiredValue == sortedArray[middle]) {
			        return middle;
			    } else if (desiredValue < sortedArray[middle]) {
			        return binarySearchRecursively(sortedArray, desiredValue, lowerIndex, middle - 1);
			    } else {
			        return binarySearchRecursively(sortedArray, desiredValue, middle + 1, higherIndex);
			    }
			}
	
	public static void main(String[] args) {
		// Executing binary search.
		int [] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		
		//Quick sort for arrays.
		Arrays.sort(myArray);
		
		//Implemented methods
		BinarySearch bsearch = new BinarySearch();
		int index = bsearch.runBinarySearchIteratively(myArray, 32, 0, 12);
		System.out.println(" Value found : " + myArray[index]+ " in index: " + index);
		int indexR = bsearch.binarySearchRecursively(myArray, 32, 0, 12);
		System.out.println(" Value found : " + myArray[indexR]+ " in index: " + indexR);
		
	}

}

