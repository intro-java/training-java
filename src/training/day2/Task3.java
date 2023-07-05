package training.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Word one: ");
        String wordOne = in.next();

        System.out.println("Word two: ");
        String wordTwo = in.next();

        System.out.println("Word three: ");
        String wordThree = in.next();

        System.out.println("Word four: ");
        String wordFour = in.next();


        List<String> words = new ArrayList<>();
        words.add(wordOne);
        words.add(wordTwo);
        words.add(wordThree);
        words.add(wordFour);

       /* for (String word : words) {
            if(word.length()<=4){
                words.remove(word);
            }
        }
        */
       /* for(int i = 0; i<words.size();i++){
            if(words.get(i).length()<=4){
                words.remove(words.get(i));
            }
        }*/


        System.out.println(removeUnderFourVer2(words));
        in.close();
    }

    public static List<String> removeUnderFourVer2(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().length() <= 4){
                iterator.remove();
            }
        }
        return list;
    }

}
