package question_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        int floors;

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        // to get no of floors details
        System.out.println("Enter the total no of floors in the building:");
        floors = sc.nextInt();

        // to get floor size for each day as per floors given
        for (int i = 1; i <= floors; i++) {
            System.out.println("Enter the floor size given on day : " + i);
            list.add(sc.nextInt());
        }
        ConstructionPlan constructionPlan = new ConstructionPlan();
        constructionPlan.implementConstructionPlan(list);
        sc.close();
    }
}
