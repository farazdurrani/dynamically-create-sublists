import java.time.Instant;

public class PerformanceTest {
	public static void main(String[] args) {
		long numberOftimeToRun = 100_000_0;
		for (int j = 0; j < 10; j++) {
			long start = Instant.now()
				.toEpochMilli();
			for (int i = 0; i < numberOftimeToRun; i++) {
				BreakOffOne.main(null); // This one doesn't have initial capacity given and is using LinkedList where
										// get
										// operation is expensive
			}
			long end = Instant.now()
				.toEpochMilli();

			long start2 = Instant.now()
				.toEpochMilli();
			for (int i = 0; i < numberOftimeToRun; i++) {
				BreakOffTwo.main(null); // This one is using ArrayList and is given initial capacity. And get operation
										// is
										// fast too on ArrayList.
			}
			long end2 = Instant.now()
				.toEpochMilli();

			long start3 = Instant.now()
				.toEpochMilli();
			for (int i = 0; i < numberOftimeToRun; i++) {
				BreakOffThree.main(null); // This one is using List's method subList.
			}
			long end3 = Instant.now()
				.toEpochMilli();

			long timeTaken = end - start;
			long timeTaken2 = end2 - start2;
			long timeTaken3 = end3 - start3;
			System.err.print(timeTaken);
			System.err.println(
				" number of milliseconds it took to run breakOff method where LinkedList was used and no initial capacity was given. And get method was used which is an expensive operation on LinkedList");
			System.err.print(timeTaken2);
			System.err.println(
				" number of milliseconds it took to run breakOff method where ArrayLists were given initial capacity and get operation was used but ArrayList has a faster get operation");
			System.err.print(timeTaken3);
			System.err.println(
				" number of milliseconds it took to run breakOff method where subList of List method is used");

			System.err.println();

		}
	}
}
