import java.util.HashSet;
import java.util.List;

public class MonthService {

    public static void listMonths(List<Month> monthList) {
        System.out.println("Month List (using for-each):");
        if (monthList.isEmpty()) {
            System.out.println("There are no months in the list.");
        } else {
            monthList.forEach(System.out::println);
            System.out.println("\nMonth List (using classic for loop):");
            for (int i = 0; i < monthList.size(); i++) {
                System.out.println("Month at index " + i + ": " + monthList.get(i).getName());
            }
        }
    }

    public static void insertAugust(List<Month> monthList) {
        boolean found = monthList.stream().anyMatch(month -> "Agost".equals(month.getName()));
        if (!found) {
            monthList.add(7, new Month("Agost"));
            System.out.println("\"Agost\" has been added in its correct position.");
        } else {
            System.out.println("\"Agost\" is already in the list.");
        }
    }

    public static void convertToHashSet(List<Month> monthList) {
        HashSet<Month> monthHashSet = new HashSet<>(monthList);
        System.out.println("HashSet created. Duplicates removed if any.");
        System.out.println("HashSet content:");
        monthHashSet.forEach(System.out::println);

        System.out.println("\nTraversing HashSet using for-each:");
        for (Month month : monthHashSet) {
            System.out.println(month.getName());
        }
    }
}
