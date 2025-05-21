import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        // 1. Adding elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");
        System.out.println("\nAfter inserting 'Grapes' at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        System.out.println("\nAfter adding more fruits:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\nElement at index 2:");
        System.out.println("ArrayList: " + arrayList.get(2));
        System.out.println("LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");
        System.out.println("\nAfter updating index 0 to 'Strawberry':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Orange");
        linkedList.remove("Orange");
        System.out.println("\nAfter removing 'Orange':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\nSearching for 'Mango':");
        System.out.println("ArrayList contains Mango: " + arrayList.contains("Mango"));
        System.out.println("LinkedList contains Mango: " + linkedList.contains("Mango"));

        // 8. List size
        System.out.println("\nSize of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("\nIterating over ArrayList using for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating over LinkedList using for-each:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArrayList = arrayList.subList(1, 3);
        List<String> subLinkedList = linkedList.subList(1, 3);
        System.out.println("\nSublist (1 to 3) of ArrayList: " + subArrayList);
        System.out.println("Sublist (1 to 3) of LinkedList: " + subLinkedList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nAfter clearing lists:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
