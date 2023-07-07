package training.day5;

public interface Animal {

    public static final int i = 1;
    public static final int a = 2;
    public static final int b = 3;

    public abstract void print();

    public default void eat() {
        System.out.println("Animal is eating!");
    }
}
