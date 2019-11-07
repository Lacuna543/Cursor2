import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> someTerms = new HashMap<>();

        //  String string = sc.next();
        //  someTerms.put("admin", "Add, please, new word:");
        someTerms.put("java", " is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible.");
        someTerms.put("software", "is a collection of data or computer instructions that tell the computer how to work.");
        someTerms.put("programmer", "is a specialist in one area of computers, or to a generalist who writes code for many kinds of software.");
        someTerms.put("IT", "it is the use of computers to store, retrieve, transmit, and manipulate data, or information, often in the context of a business or other enterprise.");

        System.out.println("List of available words: " + someTerms.keySet());

        System.out.println("Type the required word:");

        //  String string = sc.next();


        while (true) {
            String string = sc.next();

            if (string.equals("admin")) {
                addWord(someTerms);

            } else {
                String value = someTerms.get(string);
                if (value == null) {
                    System.out.println("404");
                } else {
                    System.out.print(string + " - " + value);
                }
            }


        }


    }

    static void addWord(Map<String, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add name of the topic: ");
        String addNewTopic = sc.next();
        System.out.println("Add description of the topic: ");
        String addDescription = sc.next();
        map.put(addNewTopic, addDescription);
        System.out.println("Added, print new word/ For add new topic print \"admin\"");
    }
}
