public class StringOperation {
    public static void main(String[] args) {
        String s = "abc";
        int x = 1;
        int y = 2;
        System.out.println(s + x + y);
        System.out.println(x + y);
        System.out.println(x + y + s + x + y);
    }
}
/**
 * 以字符串开头的后续操作数都被默认转换成字符串
 */
