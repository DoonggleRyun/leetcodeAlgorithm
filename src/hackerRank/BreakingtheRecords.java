package hackerRank;

public class BreakingtheRecords {

	static int[] getRecord(int[] scores) {

		int r[] = new int[2];

		int min = scores[0];
		int max = scores[0];
		int minCount = 0;
		int maxCount = 0;

		for (int i = 1, length = scores.length; i < length; i++) {
			if (scores[i] > max) {
				maxCount++;
				max = scores[i];
			} else if (scores[i] < min) {
				minCount++;
				min = scores[i];
			}
		}

		r[0] = maxCount;
		r[1] = minCount;

		return r;
	}

}
