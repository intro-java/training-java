package training.day4;

public class Singer extends Person {

    private String name;
    private boolean canPlayGuitar;
    private String bandName;

    public Singer(String name, int age, boolean canPlayGuitar, String bandName) {
        super(name, age);
        this.canPlayGuitar = canPlayGuitar;
        this.bandName = bandName;
    }

    public void sing() {
        System.out.println("Singing");
    }

    public void playGuitar() {
        if (canPlayGuitar) {
            System.out.println("Playing guitar");
        } else {
            System.out.println("I cannot play the guitar!");
        }
    }

    public void learn() {
        super.learn();
        System.out.println("Singer is learning!");
    }
}
