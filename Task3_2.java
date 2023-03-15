// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(101);
            lst.add(x);
        }
        System.out.println(lst.toString() + "\n");
        for (int i = lst.size() - 1; i > 0; i--) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(lst.get(i));
            }
        }
        System.out.println(lst.toString());
    }
}
