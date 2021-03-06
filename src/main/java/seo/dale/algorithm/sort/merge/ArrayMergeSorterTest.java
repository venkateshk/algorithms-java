package seo.dale.algorithm.sort.merge;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayMergeSorterTest {
	
	@Test
	public void test1() {
		int[] arr = {2, 1};
		ArrayMergeSorter.mergeSort(arr);
		
		int[] sortedArr = {1, 2};
		assertTrue(Arrays.equals(arr, sortedArr));
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 2, 1};
		ArrayMergeSorter.mergeSort(arr);
		
		int[] sortedArr = {1, 1, 2};
		assertTrue(Arrays.equals(arr, sortedArr));
	}

	@Test
	public void test3() {
		int[] arr = {1, 3, 2, 5, 6, 8, 7, 4};
		ArrayMergeSorter.mergeSort(arr);
		
		int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8};
		assertTrue(Arrays.equals(arr, sortedArr));
	}

}
