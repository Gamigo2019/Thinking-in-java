public class P {
    public static void main (String args[]){
        int a=1;
        int b = a++;
        int c = ++b;
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("c:" + c);
        Integer num_1 = new Integer(47);
        Integer num_2 = new Integer(47);
        System.out.println(num_1 == num_2);
        System.out.println(num_1 != num_2);
        int d = c;
        int e = 2;
        System.out.println(c == d);
        System.out.println(c == e);

    }
}
