import java.util.LinkedList;
import java.util.List;

public class BreakOffOne {
	public static void main(String[] args) {
		List<String> mainList = prepareList();
		//System.out.println("Total items in list " + mainList.size());
		List<List<String>> sublists = breakList(mainList, 4);
		if(true) {
			return;
		}
		// tests
		List<String> mainListCopy = new LinkedList<>(mainList);
		List<String> mainListCopy2 = new LinkedList<>(mainList);
		List<String> testList = new LinkedList<>();

		for (List<String> list : sublists) {
			testList.addAll(list);
		}

		//System.out.println("Exhaustive test both ways.");

		//first test mainList
		mainListCopy.removeAll(testList);

		if (mainListCopy.size() > 0) {
			throw new RuntimeException(
				"How could it be. breakList(..) method must be broken");
		}
		//now test the other list. This way we are sure no element is missed.
		testList.removeAll(mainListCopy2);

		if (testList.size() > 0) {
			throw new RuntimeException(
				"How could it be. breakList(..) method must be broken");
		}
		
		//System.out.println("Exhaustive testing finished. If no exception is thrown, tests passed.");

	}

	public static List<List<String>> breakList(List<String> list,
		double maxItems) {
		//System.out.println("Max elements allowed in a list: " + maxItems);
		List<List<String>> smallerLists = new LinkedList<>();

		if (list.size() <= maxItems) {
			smallerLists.add(list);
			return smallerLists;
		}

		int numberOfSmallerLists = (int) Math.ceil(list.size() / maxItems);

		//System.out.println(
		//	"Number of smaller lists to be made: " + numberOfSmallerLists);

		// add empty lists
		for (int i = 0; i < numberOfSmallerLists; i++) {
			smallerLists.add(new LinkedList<String>());
		}

		int i = 0;
		for (List<String> smallList : smallerLists) {
			while (i < list.size()) {
				smallList.add(list.get(i));
				i++;
				if (smallList.size() == maxItems) {
					break;
				}
			}
		}
		return smallerLists;
	}

	public static List<String> prepareList() {
		List<String> mainList = new LinkedList<>();
		mainList.add("one");
		mainList.add("two");
		mainList.add("three");
		mainList.add("four");
		mainList.add("five");
		mainList.add("six");
		mainList.add("seven");
		mainList.add("eight");
		mainList.add("nine");
		mainList.add("ten");
		mainList.add("eleven");
		mainList.add("twelve");
		mainList.add("thriteen");
		mainList.add("fourteen");
		mainList.add("fifteen");
		mainList.add("sixteen");
		mainList.add("seventeen");
		mainList.add("eighteen");
		mainList.add("nineteen");
		mainList.add("twenty");
		mainList.add("twentyone");
		mainList.add("twentytwo");
		mainList.add("twentythree");
		mainList.add("twentyfour");
		mainList.add("twentyfive");
		mainList.add("twentysix");
		mainList.add("twentyseven");
		mainList.add("twentyeight");
		mainList.add("twentynine");
		mainList.add("thirty");
		mainList.add("thirtyone");
		mainList.add("thirtytwo");
		mainList.add("thirtythree");
		mainList.add("thirtyfour");
		mainList.add("thirtyfive");
		mainList.add("thirtysix");
		mainList.add("thirtyseven");
		mainList.add("thirtyeight");
		mainList.add("thirtynine");
		mainList.add("fourty");
		mainList.add("fourtyone");
		return mainList;
	}

}
