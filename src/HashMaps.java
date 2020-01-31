import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
        myMap.put(4,"four");
        myMap.put(5,"five");
        myMap.put(6,"six");
        myMap.put(7,"seven");
        myMap.put(8,"eight");
        myMap.put(9,"nine");
        myMap.put(10,"ten");

        //prompt user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String value = myMap.get(number);

        if(myMap.containsKey(number)){
            System.out.println();
            System.out.println("You entered "+value);
        }
        else {
            System.out.print("New number, please type "+number+" out as a word: ");
            String numWord = sc.next();

            myMap.put(number, numWord);
            value = myMap.get(number);
            System.out.println("You entered "+value);

        }


    }
}
