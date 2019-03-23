public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <3; i++) {
            System.out.println(i);
            for (int x : arr) {
                //System.out.println(x);
                break;
            }
            System.out.println("a");
        }
    }
}
