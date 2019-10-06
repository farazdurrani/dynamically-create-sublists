import java.time.Instant;

public class PerformanceTest {
	public static void main(String[] args) {
		long numberOftimeToRun = 100_000_00;
		long start = Instant.now()
			.toEpochMilli();
		for (int i = 0; i < numberOftimeToRun; i++) {
			BreakOffOne.main(null); // This one doesn't have initial capacity given and is using LinkedList where get
									// operation is expensive
		}
		long end = Instant.now()
			.toEpochMilli();

		long start2 = Instant.now()
			.toEpochMilli();
		for (int i = 0; i < numberOftimeToRun; i++) {
			BreakOffTwo.main(null); // This one is using ArrayList and is given initial capacity. And get operation is
									// fast too on ArrayList.
		}
		long end2 = Instant.now()
			.toEpochMilli();
		long timeTaken = end - start;
		long timeTaken2 = end2 - start2;
		System.err.print(timeTaken);
		System.err.println(
			" number of milliseconds it took to run breakOff method where ArrayLists are dynamically resizing due to lack of initial capacity");
		System.err.print(timeTaken2);
		System.err.println(
			" number of milliseconds it took to run breakOff method where ArrayLists were given initial capacity");

		System.err.println("BreakOffTwo ran faster than BreakOffOne by "
			+ (timeTaken - timeTaken2) + " milliseconds");

	}
}
