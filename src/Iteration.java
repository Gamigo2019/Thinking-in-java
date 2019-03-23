import java.util.*;

import static java.lang.StrictMath.sqrt;
import static java.util.stream.IntStream.range;
//import static java.util.stream.LongStream.range;


public class Iteration {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[25];
        arr[0] = rand.nextInt();
        System.out.println(arr[0]);
        for (int i = 1; i < 25; i++) {
            arr[i] = rand.nextInt();
            System.out.println(arr[i]);
            if (arr[i - 1] > arr[i])
                System.out.println("big");
            else if (arr[i - 1] < arr[i])
                System.out.println("samll");
            else System.out.println("equal");

        }
//        int a;
//        while(true){
//            a = rand.nextInt();
//            System.out.println(a);
//        }
        for (int i = 1, j = 0; i < 100; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
                j++;
                if (j % 10 == 0) System.out.println();
            }

        }

        for (int x : arr) {
            System.out.println(x);
        }
//
/**
 * import static jdk.nashorn.internal.objects.Global.print;
 * print("a"); 报错
 * Exception in thread "main" java.lang.NullPointerException
 * 	at java.util.Objects.requireNonNull(Objects.java:203)
 * 	at jdk.nashorn.internal.objects.Global.instance(Global.java:1017)
 * 	at jdk.nashorn.internal.objects.Global.instanceFrom(Global.java:1021)
 * 	at jdk.nashorn.internal.objects.Global.print(Global.java:1494)
 * 	at Iteration.main(Iteration.java:35)
 */
    }

    static boolean prime(int a) {
        if (a <= 2) return true;
        for (int i = 2; i <= sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
