package ds.util.algorithm.cf.classes;

import java.util.Scanner;

import ds.util.algorithm.cf.classes.ArrayDequeExamples;
import ds.util.algorithm.cf.classes.ArrayListExamples;
import ds.util.algorithm.cf.classes.ArraysExamples;
import ds.util.algorithm.cf.classes.DictionaryExamples;
import ds.util.algorithm.cf.classes.HashMapExamples;
import ds.util.algorithm.cf.classes.HashSetExamples;
import ds.util.algorithm.cf.classes.HashtableExamples;
import ds.util.algorithm.cf.classes.IdentityHashMapExamples;
import ds.util.algorithm.cf.classes.LinkedHashMapExamples;
import ds.util.algorithm.cf.classes.LinkedHashSetExamples;
import ds.util.algorithm.cf.classes.LinkedListExamples;
import ds.util.algorithm.cf.classes.PriorityQueueExamples;
import ds.util.algorithm.cf.classes.PropertiesExamples;
import ds.util.algorithm.cf.classes.StackExamples;
import ds.util.algorithm.cf.classes.TreeMapExamples;
import ds.util.algorithm.cf.classes.TreeSetExamples;
import ds.util.algorithm.cf.classes.VectorExamples;
import ds.util.algorithm.cf.classes.WeakHashMapExamples;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect the examples you want to run:");
            System.out.println("1. Arrays Class Examples");
            System.out.println("2. ArrayList Class Examples");
            System.out.println("3. LinkedList Class Examples");
            System.out.println("4. Vector Class Examples");
            System.out.println("5. Stack Class Examples");
            System.out.println("6. HashSet Class Examples");
            System.out.println("7. LinkedHashSet Class Examples");
            System.out.println("8. TreeSet Class Examples");
            System.out.println("9. PriorityQueue Class Examples");
            System.out.println("10. ArrayDeque Class Examples");
            System.out.println("11. HashMap Examples");
            System.out.println("12. LinkedHashMap Examples");
            System.out.println("13. IdentityHashMap Examples");
            System.out.println("14. WeakHashMap Examples");
            System.out.println("15. TreeMap Examples");
            System.out.println("16. Dictionary Examples");
            System.out.println("17. Hashtable Examples");
            System.out.println("18. Properties Examples");
            System.out.println("19. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ArraysExamples arraysExamples = new ArraysExamples();
                    arraysExamples.runExamples();
                    break;
                case 2:
                    ArrayListExamples arrayListExamples = new ArrayListExamples();
                    arrayListExamples.runExamples();
                    break;
                case 3:
                    LinkedListExamples linkedListExamples = new LinkedListExamples();
                    linkedListExamples.runExamples();
                    break;
                case 4:
                    VectorExamples vectorExamples = new VectorExamples();
                    vectorExamples.runExamples();
                    break;
                case 5:
                    StackExamples stackExamples = new StackExamples();
                    stackExamples.runExamples();
                    break;
                case 6:
                    HashSetExamples hashSetExamples = new HashSetExamples();
                    hashSetExamples.runExamples();
                    break;
                case 7:
                    LinkedHashSetExamples linkedHashSetExamples = new LinkedHashSetExamples();
                    linkedHashSetExamples.runExamples();
                    break;
                case 8:
                    TreeSetExamples treeSetExamples = new TreeSetExamples();
                    treeSetExamples.runExamples();
                    break;
                case 9:
                    PriorityQueueExamples priorityQueueExamples = new PriorityQueueExamples();
                    priorityQueueExamples.runExamples();
                    break;
                case 10:
                    ArrayDequeExamples arrayDequeExamples = new ArrayDequeExamples();
                    arrayDequeExamples.runExamples();
                    break;
                case 11:
                    HashMapExamples hashMapExamples = new HashMapExamples();
                    hashMapExamples.runExamples();
                    break;
                case 12:
                    LinkedHashMapExamples linkedHashMapExamples = new LinkedHashMapExamples();
                    linkedHashMapExamples.runExamples();
                    break;
                case 13:
                    IdentityHashMapExamples identityHashMapExamples = new IdentityHashMapExamples();
                    identityHashMapExamples.runExamples();
                    break;
                case 14:
                    WeakHashMapExamples weakHashMapExamples = new WeakHashMapExamples();
                    weakHashMapExamples.runExamples();
                    break;
                case 15:
                    TreeMapExamples treeMapExamples = new TreeMapExamples();
                    treeMapExamples.runExamples();
                    break;
                case 16:
                    DictionaryExamples dictionaryExamples = new DictionaryExamples();
                    dictionaryExamples.runExamples();
                    break;
                case 17:
                    HashtableExamples hashtableExamples = new HashtableExamples();
                    hashtableExamples.runExamples();
                    break;
                case 18:
                    PropertiesExamples propertiesExamples = new PropertiesExamples();
                    propertiesExamples.runExamples();
                    break;
                case 19:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
