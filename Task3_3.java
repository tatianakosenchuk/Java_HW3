// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(101);
            lst.add(x);
        }
        System.out.println(lst.toString() + "\n");
        int max = Collections.max(lst);
        int min = Collections.min(lst);
        double sum = 0;
        for (int element : lst) {
            sum += element;
        }
        double avg = sum / lst.size();
        System.out.println(avg);
        System.out.println("Maximum value: " + max + "\nMinimum value: " + min + "\nAverage: " + avg);
    }
}