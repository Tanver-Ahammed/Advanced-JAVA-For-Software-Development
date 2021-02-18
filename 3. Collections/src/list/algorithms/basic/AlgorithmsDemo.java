package list.algorithms.basic;

import java.util.*;

public class AlgorithmsDemo {

    public void execute() {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());

        Collections.sort(list, Comparator.naturalOrder());

        System.out.println(list);

        int index = Collections.binarySearch(list,99);

        System.out.println("Found on " + index + " index.");
    }

}
