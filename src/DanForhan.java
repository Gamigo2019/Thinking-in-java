public class DanForhan {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if (i * j < 1000) continue;
                count++;
                int[] arr1 = new int[4];
                int[] arr2 = new int[4];
                arr1[0] = i % 10;
                arr1[1] = i / 10;
                arr1[2] = j % 10;
                arr1[3] = j / 10;
                arr2[0] = i * j % 10;
                arr2[1] = i * j / 10 % 10;
                arr2[2] = i * j / 100 % 10;
                arr2[3] = i * j / 1000 % 10;
                int[] arr3 = new int[10];
                int[] arr4 = new int[10];
                for (int k = 0; k < 4; k++) {//桶排序
                    arr3[arr1[k]]++;
                }
                for (int k = 0; k < 4; k++) {
                    arr4[arr2[k]]++;
                }
                int k;
                for (k = 0; k < 10; k++) {
                    if (arr3[k] != arr4[k]) {
                        break;
                    }
                }
                if (k == 10 && i < j)
                    System.out.println(i * j + "=" + i + "*" + j+" 第" + count + "次");
            }
        }
        System.out.println("共查找" + count + "次");

    }
}
