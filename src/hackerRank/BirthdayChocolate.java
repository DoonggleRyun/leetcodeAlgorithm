package hackerRank;

import java.util.List;

public class BirthdayChocolate {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {

		int count = 0;
		int size = s.size();
		// int num = size - m + 1;
		for (int i = 0; i < size - m + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + m && j < size; j++) {
				sum += s.get(i);

			}

			if (sum == d) {
				count++;
			}
		}

		return count;
	}

}

//
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
//
// public class Solution {
//
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// int[] squares = new int[n];
// for(int squares_i=0; squares_i < n; squares_i++){
// squares[squares_i] = in.nextInt();
// }
// int d = in.nextInt();
// int m = in.nextInt();
// // your code goes here
// int count = 0;
// for(int i=0; i<n-m+1; i++) {
// int sum=0;
// for(int j=i; j<i+m; j++) {
// sum+=squares[j];
// }
// if(sum==d) {
// count++;
// }
// }
// System.out.println(count);
// }
// }