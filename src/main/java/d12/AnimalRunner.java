package d12;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog(23);

        Cat c1 = new Cat(2);


        int d1Age = d1.getAge();

        d1.speak();
        System.out.println(d1Age);
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        d2.speak();
        c1.speak();

    }
}
