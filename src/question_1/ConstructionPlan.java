package question_1;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

public class ConstructionPlan {

    public void implementConstructionPlan(LinkedList<Integer> list) {

        int length = list.size();

        LinkedList<Integer> sortedList = new LinkedList<>();
        sortedList = (LinkedList<Integer>) list.clone();

        Collections.sort(sortedList, Collections.reverseOrder());

        Stack<Integer> stack = new Stack<>();

        // order in which construction happens
        System.out.println("The Order of construction is as follows");
        System.out.println();

        int day = 1;

        for (int i = 1; i <= length; i++) {
            if (!sortedList.isEmpty() && !list.isEmpty()) {
                if (sortedList.getFirst() == list.getFirst()) {
                    System.out.println("Day: " + day);
                    System.out.print(list.removeFirst() + " ");
                    sortedList.removeFirst();
                    while ((!stack.isEmpty()) && (stack.peek() == sortedList.peekFirst())) {
                        System.out.print(stack.pop() + " ");
                        sortedList.removeFirst();
                    }
                    System.out.println();
                    day++;
                } else {
                    do {
                        if (!list.isEmpty()) {
                            stack.push(list.removeFirst());
                            Collections.sort(stack);
                            System.out.println("Day: " + day);
                            System.out.println();
                            day++;
                        }
                    } while (!(sortedList.getFirst() == list.getFirst()));
                }
            }
        }
    }
}
