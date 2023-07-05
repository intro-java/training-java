package training.day2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = " Hello";
        s = s.concat(" World ");
        System.out.println(s);
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf("World", 7));
        System.out.println(s.substring(0, 6));
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("hello"));
        System.out.println(s.contains("lo"));
        System.out.println(s.replace("l", "L"));
        System.out.println(s.trim());

        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = sb;
        sb.append(" World");
        System.out.println(sb);
        sb = sb.append(" World");
        System.out.println("Sb2: " + sb2);
        sb.delete(1, 5);
        sb.insert(1, "H");
        sb.reverse();

        System.out.println(sb);

        int[] integers = new int[3];
        int[] integersTwo = {1, 2};
        for (int i : integers) {
            System.out.println(i);
        }
        Arrays.sort(integers);
        Arrays.binarySearch(integers, 1);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(101);
        integerArrayList.remove(new Integer(101));
        String str = "World";
        str = "Hello";

        System.out.println( str == "Hello" );
        System.out.println("Hello" == new String("Hello").intern());

        Integer[] arr = integerArrayList.toArray(new Integer[0]);
        List<Integer> arrList = Arrays.asList(arr);
    }
}