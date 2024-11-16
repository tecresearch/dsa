package ds.util.algorithm.cf.interfaces;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect the examples you want to run:");
            System.out.println("1. Collection Interface Examples");
            System.out.println("2. List Interface Examples");
            System.out.println("3. Set Interface Examples");
            System.out.println("4. Queue Interface Examples");
            System.out.println("5. Map Interface Examples");
            System.out.println("6. SortedSet Interface Examples");
            System.out.println("7. NavigableSet Interface Examples");
            System.out.println("8. Deque Interface Examples");
            System.out.println("9. SortedMap Interface Examples");
            System.out.println("10. NavigableMap Interface Examples");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CollectionInterfaceExp collectionExamples = new CollectionInterfaceExp();
                    collectionExamples.runExamples();
                    break;
                case 2:
                    ListExamples listExamples = new ListExamples();
                    listExamples.runExamples();
                    break;
                case 3:
                    SetExamples setExamples = new SetExamples();
                    setExamples.runExamples();
                    break;
                case 4:
                    QueueExamples queueExamples = new QueueExamples();
                    queueExamples.runExamples();
                    break;
                case 5:
                    MapExamples mapExamples = new MapExamples();
                    mapExamples.runExamples();
                    break;
                case 6:
                    SortedSetExamples sortedSetExamples = new SortedSetExamples();
                    sortedSetExamples.runExamples();
                    break;
                case 7:
                    NavigableSetExamples navigableSetExamples = new NavigableSetExamples();
                    navigableSetExamples.runExamples();
                    break;
                case 8:
                    DequeExamples dequeExamples = new DequeExamples();
                    dequeExamples.runExamples();
                    break;
                case 9:
                    SortedMapExamples sortedMapExamples = new SortedMapExamples();
                    sortedMapExamples.runExamples();
                    break;
                case 10:
                    NavigableMapExamples navigableMapExamples = new NavigableMapExamples();
                    navigableMapExamples.runExamples();
                    break;
                case 11:
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
