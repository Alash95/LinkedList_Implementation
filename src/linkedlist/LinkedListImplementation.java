package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<String>();

        list1.add("Tobi");
        list1.add("Noah");
        list1.add("Adeolu");
        list1.add("Oyin");
        list1.add("Oyin");

//        print(list1.toString());

        int position = 2;
        String element = "Moses";
        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("Moses");
        list2.add("Kenny");
//        print(list2.toString());

//        insertElementAtGivenPosition(list1, position, element);
//        insertElementsIntoALinkedList(list1, list2, position);
//        insertionOfElementsAtFirstAndLastPosition(list1, list2);
//        addLast(list1, "Moses");
//        addFirst(list1, "Moses");
//        iterateThroughLinkedList(list1);
//        getFirstAndLastOccurrence(list1, "Noah", "Oyin");
//        insertSpecifiedElementAtTheEnd(list1, "Chidinma");
//        iterateAListInReverseOrder(list1);
        iterateAListStartingAtAnIndex(list1, 2);








    }

    public static void print(String e){
        System.out.print(e);
    }

    /**
        1. Write a Java Program to Insert the Specified Element at the Specified Position in
           the LinkedList
     */
    public static void insertElementAtGivenPosition(LinkedList<String> linkedList, int position, String element) {

        if (position < 0 || position > linkedList.size()){
            print("Invalid position");
        }

        linkedList.add(position, element);
        print(linkedList.toString());

    }

    /**
    2. Write a Java Program to Insert some Elements at the Specified Position into a
        LinkedList
     */

    public static void insertElementsIntoALinkedList(LinkedList<String> existingList, LinkedList<String> newList, int position) {
        if (position < 0 || position > existingList.size()) {
            print("Invalid position");
        }
        for (String element: newList) {
            existingList.add(position, element);
            position++;
        }
        print(existingList.toString());
    }

    /**
     * 3. Write a Java Program to Insert Elements into the LinkedList at the First and Last
     *    position
     */

    public static void insertionOfElementsAtFirstAndLastPosition(LinkedList<String> list1, LinkedList<String> list2) {
        if (list2.size() > 2) {
            print("invalid position");
        }
        list1.addFirst(list2.get(0));
        list1.addLast(list2.get(1));

        print(list1.toString());
    }

    /**
     * 4. Write a Java Program to Append the Specified Element to the end of a LinkedList
     */

    public static void addLast(LinkedList<String> list1, String element) {
        list1.add(element);
        print(list1.toString());
    }

    /**
     * 5. Write a Java Program to Insert the Specified Element at the Front of a LinkedList
     */
    public static void addFirst(LinkedList<String> list1, String element) {
        list1.addFirst(element);
        print(list1.toString());
    }

    /**
     * 6. Write a Java Program to Iterate through all Elements in a LinkedList
     */
    public static void iterateThroughLinkedList(LinkedList<String> list1) {
        for (String element: list1) {
            print(element + " ");
        }
//        list1.listIterator(0);
//        print(list1.toString());
    }

    /**
     * 7. Write a Java Program to Get the First and Last Occurrence of the Specified
     *    Elements in a LinkedList
     */
    public static void getFirstAndLastOccurrence(LinkedList<String> list1, String element1, String element2) {
       if (!list1.contains(element1) || !list1.contains(element2)) {
           print("Input does not exist");
       }
       print("First occurrence of element1 is: ");
        print(String.valueOf(list1.indexOf(element1)));
        System.out.println();
        print("First occurrence of element2 is: ");
        print(String.valueOf(list1.indexOf(element2)));
        System.out.println();
        print("Last occurrence of element1 is: ");
        print(String.valueOf(list1.lastIndexOf(element1)));
        System.out.println();
        print("Last occurrence of element2 is: ");
        print(String.valueOf(list1.lastIndexOf(element2)));
    }

    /**
     * 8. Write a Java Program to Insert the Specified Element at the end of a LinkedList
     */

    public static void insertSpecifiedElementAtTheEnd(LinkedList<String> list, String element) {
        list.offerLast(element);
        print(list.toString());
    }

    /**
     * 9. Write a Java Program to Iterate a LinkedList in Reverse Order
     */
    public static void iterateAListInReverseOrder(LinkedList<String> list) {
        Iterator<String> descendingIterator = list.descendingIterator();

        while (descendingIterator.hasNext()) {
            String element = descendingIterator.next();
            print(element + " ");
        }
    }

    /**
     * 10. Write a Java Program to Iterate through all Elements in a LinkedList starting at
     *     the specified position
     */

    public static void iterateAListStartingAtAnIndex(LinkedList<String> list, int index) {
        Iterator<String> listIterator = list.listIterator(index);

        while (listIterator.hasNext()) {
            String element = listIterator.next();
            print(element + " ");
        }
    }






}
