package d12;

public class Cat implements Animal{

    private String name = "Whisky";
    private int age = 2;
    @Override
    public void speak() {
        System.out.println("Hello my name is " + name);
    }

    @Override
    public int getOlder() {
        try {
            Thread.sleep(9000);
            return age++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
    }
}
