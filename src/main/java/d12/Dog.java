package d12;

public class Dog implements Animal {

    private String name = "Doggg";
    private int age = 14;
    @Override
    public void speak() {
        System.out.println("Hello my name is " + name);
    }

    @Override
    public int getOlder(){
        return age++;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }
}
