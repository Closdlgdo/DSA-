import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Carlos");
        namesLinkedList.add("Theano");
        namesLinkedList.add("Lucas");
        namesLinkedList.add("Ra");
        System.out.println(namesLinkedList.get(2));
        //This works as a link of a chain. Each node has a point to the following node. A doubly linked list goes full
        // circle.
        //This is fastest when you want to add or remove elements.
        namesLinkedList.add(1, "Churro");
        System.out.println(namesLinkedList);

        long startTime = System.currentTimeMillis();
        System.out.println(namesLinkedList.get(2));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time to get element using LinkedList: " + elapsedTime + " milliseconds");

        startTime = System.currentTimeMillis();
        namesLinkedList.add(1, "Churro");
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Time to add element using LinkedList: " + elapsedTime + " milliseconds");


        /*
        * The LinkedList is a data structure that consists of a sequence of nodes, where each node contains a
        * reference to the next node in the sequence. This creates a chain-like structure, where elements can be
        * added or removed quickly by updating the references between the nodes. In the code, the LinkedList is
        * created using the LinkedList<String>() constructor and elements are added to it using the add() method.
        * The get() method is used to retrieve an element from the list by index. The add() method can also be used
        * to insert elements at a specific position in the list.
        *
        * The time complexity of accessing an element in a LinkedList by index is O(n), where n is the index of the
        * element. This is because a LinkedList does not use an array as its underlying data structure, and instead, to
        * access an element at a particular index, the list must be traversed from the beginning until the desired
        * element is found. Therefore, the time it takes to access an element in a LinkedList grows linearly with the
        * index of the element.
        *
        * The time complexity of inserting or removing an element at a specific index in a LinkedList is O(1), which
        * means that it takes a constant amount of time regardless of the size of the list. This is because the
        * LinkedList only needs to update a few references to add or remove an element at a specific index, and it does
        * not need to shift any other elements as it does in an ArrayList.
        * */

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Carlos");
        namesArrayList.add("Theano");
        namesArrayList.add("Lucas");
        namesArrayList.add("Ra");
        System.out.println(namesArrayList.get(1));
        System.out.println(namesArrayList);
        //This uses an array as its underlined structure. The Dynamic array takes
        //a lot of space and time to create.
        //This is fastest when you want to find an element.
        namesArrayList.add(2, "Betty");
        System.out.println(namesArrayList);

        startTime = System.currentTimeMillis();
        System.out.println(namesArrayList.get(1));
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Time to get element using ArrayList: " + elapsedTime + " milliseconds");

        startTime = System.currentTimeMillis();
        namesArrayList.add(2, "Betty");
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Time to add element using ArrayList: " + elapsedTime + " milliseconds");
        /*
        * The ArrayList is a data structure that uses an array as its underlying structure. It can hold a collection of
        * elements and allows access to individual elements based on their index. In the code, the ArrayList is created
        * using the ArrayList<String>() constructor and elements are added to it using the add() method. The get()
        * method is used to retrieve an element from the list by index. The add() method can also be used to insert
        * elements at a specific position in the list.
        *
        * The time complexity of accessing an element in an ArrayList by index is O(1), which means that it takes a
        * constant amount of time regardless of the size of the list. This is because the ArrayList uses an array as its
        * underlying data structure, and accessing an element by index in an array takes constant time.
        *
        * The time complexity of inserting or removing an element at a specific index in an ArrayList is O(n), where n
        * is the number of elements that come after the inserted or removed element. This is because, when an element is
        * inserted or removed, all the elements that come after it in the array must be shifted to make room for the
        * new element or fill the gap left by the removed element. This can be a costly operation, especially if the
        * array is large.
        */
    }
}
