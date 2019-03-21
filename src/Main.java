import java.util.*;

/**
 * @author Gamigo
 */
public class Main {

    public static void main(String[] args) {
//        Scope s = new Scope();
////        System.out.println(s.getAnInt());
////        System.out.println(s.getCharacter());
////        System.out.println("现在是：" + new Date());
//////        System.out.println("Hello World!");
////        System.out.println("Hello World!");
////        int temp = 12345666;
////        String num = new String();
////        num = (String)temp;
////        System.out.println(temp);

        ScopeFloat f1 = new ScopeFloat();
        ScopeFloat f2 = new ScopeFloat();
        f1.f = 1.1f;
        f2.f = 1.2f;
        System.out.println("f1:" + f1.f);
        System.out.println("f2:" + f2.f);
//        f1 = f2;//此处f2赋给f1，二者指向相同的对象。原本f1的引用被回收。
//        System.out.println("f1:"+f1.f);//1.2
//        System.out.println("f2:"+f2.f);//1.2
        f2.f = 1.9f;
        f1.f = f2.f;
        System.out.println("f1:" + f1.f);
        System.out.println("f2:" + f2.f);
        f1.f = 1.3f;
        System.out.println("f1:" + f1.f);
        System.out.println("f2:" + f2.f);
        System.out.println("舒服");
        Random rand = new Random(55);
        int number_r[] = new int[7];
        for (int i = 0; i < 7; i++) {
            number_r[i] = rand.nextInt() + 1;
        }
        for(int i=0 ;i<7;i++){
            System.out.print(number_r[i]+" ");
        }

    }
}
