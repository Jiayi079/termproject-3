import java.util.*;

public class HelloWorld {

    public static void main(String args[]){

        System.out.println("Hello World");

        int[] intArray = new int[12]; // data in a row in memory
        List<Integer> myList = new ArrayList<>(); //array
        List<Integer> myList2 = new LinkedList<>(); // double linked list

        // DataStructureType<DataType> myCollection = new ImplementingClass<>();
        Set<String> mySet = new HashSet<>(); // good
        HashSet<String> mySet2 = new HashSet<>(); // not good
        TreeSet<String> mySet3 = new TreeSet<>(); // not good
        // HashSet = fast but no order (sorted random)
        // TreeSet = slow but in order
    }
}
