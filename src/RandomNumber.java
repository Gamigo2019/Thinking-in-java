import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        i = rand.nextInt(100);
        j = rand.nextInt(100);
        k = rand.nextInt(100);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}
