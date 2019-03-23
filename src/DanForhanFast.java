public class DanForhanFast {
    public static void main(String[] args) {
        String[] ar_str1 = null, ar_str2;
        int sum = 0;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int i_val = i * j;
                if (i_val < 1000 || i_val > 9999)
                    continue; // 积小于1000或大于9999排除,继续下一轮环
                count++;
                ar_str1 = String.valueOf(i_val).split("");
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                java.util.Arrays.sort(ar_str1);
                java.util.Arrays.sort(ar_str2);
                if (java.util.Arrays.equals(ar_str1, ar_str2)) {
                    // 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
                }
            }
        }
        System.out.println("共找到" + sum + "组吸血鬼数" + "\ncount" + count);

    }
}
/**
 * 用String.valueOf(j)).split("");的方法来把数字转换为字符串，
 * 排序，比较4位数的字符串和两个2位数的字符串，若相等，就是吸血鬼数字。
 */