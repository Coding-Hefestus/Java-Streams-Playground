package beautiful_triplets;

import java.util.stream.IntStream;

public final class Main {

	public static void main(String[] args) {
	
		/*
		 * The Problem (not sure if link is valid) -> https://www.hackerrank.com/challenges/beautiful-triplets/problem?utm_source=mobile&utm_medium=mobile_browser
		 */
		
		
		final int[] arr = new int[] {2,2,3,4,5}; final int difference = 1;
		
		//final int[] arr = new int[] {1, 2, 4, 5, 7, 8, 10}; final int difference = 3;

		
		int tripletCount = (int) IntStream.rangeClosed(0, arr.length-1).boxed()
				.flatMap(i -> IntStream.rangeClosed(i, arr.length-1).boxed()
						.flatMap(j -> IntStream.rangeClosed(j, arr.length-1)
								.mapToObj(k -> new int[] {i, j, k} ) ) )
								.filter(triplet -> triplet[0] < triplet[1] && triplet[1] < triplet[2])
								.filter(triplet -> (arr[triplet[1]] - arr[triplet[0]] == difference) && (arr[triplet[2]] - arr[triplet[1]] == difference) )
								.count();
		
		System.out.println(tripletCount);
				
										
												
									
												
												
										
										

	}

}
