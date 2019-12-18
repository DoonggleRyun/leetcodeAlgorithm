package hackerRank;

public class DivisibleSumPairs0520 {

	static int divisibleSumPairs(int n, int k, int[] ar) {

		int temp = 0;
		int count = 0;

		for (int i = 0; i < ar.length; i++) {

			for (int j = i+1; j >i && j < ar.length; j++) {
				temp = ar[i] + ar[j];
				if (temp % k == 0)
					count++;

			}

		}

		return count;

	}

}
