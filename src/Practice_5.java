public class Practice_5 {
    public static void main(String[] args){
        Dog dog_1 = new Dog();
        Dog dog_2 = new Dog();
        dog_1.name = "spot";
        dog_2.name = "scruffy";
        dog_1.says = "Ruff!";
        dog_2.says = "Wurf";
        System.out.println("dog_1 name:"+dog_1.name+" says:"+dog_1.says);
        System.out.println("dog_2 name:"+dog_2.name+" says:"+dog_2.says);
        Dog dog_3 = dog_1;
        Dog dog_4 = new Dog();
        dog_4.name = "spot";
        dog_4.says = "Ruff!";
        System.out.println(dog_1.equals(dog_3));
        System.out.println(dog_1==dog_3);
        System.out.println(dog_1.equals(dog_4));
        System.out.println(dog_1==dog_4);
    }
}

class Dog{
    String name;
    String says;
}
