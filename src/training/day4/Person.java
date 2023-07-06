package training.day4;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void learn() {
        System.out.println("The person is learning");
    }

    public void eat() {
        System.out.println("The person is eating");
    }

    public void talk() {
        System.out.println("The person is talking");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
