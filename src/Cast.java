public class Cast {
    public static void main(String[] args) {
        char a = 'a', b = 'b';
        int i = a * b;
        char c;
        c = (char) (a * b);
        System.out.println((int) a);
        System.out.println(a * b);//97*98
        System.out.println(i);
        System.out.println(c);

        String s1 = "asdf";
        String s2 = "qwer";
        TestOne t = new TestOne();
        t.Mathod(s1,s2);
    }
}

class TestOne{
    public void Mathod(String s1, String s2){
        System.out.println(s1==s2);
        System.out.println(s1!=s2);
        System.out.println(s1.equals(s2));
//        System.out.println(s1>>s2);
    }
}