package training.day5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {

    private LocalDate creationDate;
    private Person person;
    private ArrayList<Video> savedVideos;

    public Account(LocalDate creationDate, Person person, ArrayList<Video> savedVideos) {
        this.creationDate = creationDate;
        this.person = person;
        this.savedVideos = savedVideos;
    }
}
