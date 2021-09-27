import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;

        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);
        linkedList.add(a);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(a);
        arrayList.add(b);

        //search#1Linkedlist
        System.out.println("First index of a is : " + linkedList.indexOf(a));
        System.out.println("Last index of a is: " + linkedList.lastIndexOf(a));

        //search#2Linkedlist
        System.out.println("First index of b is: " + linkedList.indexOf(b));
        System.out.println("Last index of b is: " + linkedList.lastIndexOf(b));

        //Remove from LinkedList
        System.out.println("LinkedList: " + linkedList);
        linkedList.remove(2);
        System.out.println("LinkedList without 2-nd element: " + linkedList);

        //search in ArrayList
        System.out.println("Content of array list: " + arrayList);
        System.out.println(arrayList.contains("a") + "");
        System.out.println(arrayList.contains(1) + "");

        //Remove from array list
        System.out.println("ArrayList: " +arrayList);
        arrayList.remove(a);
        System.out.println("ArrayList without 1-st element: " +arrayList);
    }
}
