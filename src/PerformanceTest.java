import java.time.Instant;

public class PerformanceTest {
	public static void main(String[] args) {
		long start = Instant.now().toEpochMilli();
		BreakOffOne.main(null);
		long end = Instant.now().toEpochMilli();
		System.err.print(end-start);
		System.err.println(" number of milliseconds it took to run breakOff method where ArrayLists are dynamically resizing due to lack of initial capacity");
		start = Instant.now().toEpochMilli();
		BreakOffTwo.main(null);
		end = Instant.now().toEpochMilli();
		System.err.print(end-start);
		System.err.println(" number of milliseconds it took to run breakOff method where ArrayLists were given initial capacity");
		System.err.println("If run enough times, BreakOffTwo is faster where ArrayLists are given initial capacity");
	}
}
