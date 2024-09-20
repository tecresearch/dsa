package ds.util.algorithm.trees;

public class Runner {
    public static void main(String[] args) {
        Tree bst = new Tree();
        TreeNode root = bst.createBst();

        do {
            System.out.println("Press 1 to insert data in Bst");
            System.out.println("Press 2 to pre-order traverse of Bst");
            System.out.println("Press 3 to in-order traverse of Bst");
            System.out.println("Press 4 to post-order traverse of Bst");
            System.out.println("Press 5 to search element in Bst");
            System.out.println("Press 6 to delete Node No Child data from Bst");
            System.out.println("Press 7 to delete Node One Child data from Bst");
            System.out.println("Press 8 to delete Node Both Child data from Bst");
            System.out.println("Press 9 to terminate the execution");
            System.out.print("Enter choice: ");
            
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int ch = sc.nextInt();
            int element;

            switch (ch) {
                case 1:
                    System.out.print("Enter number of elements to insert: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element " + (i + 1) + " : ");
                        element = sc.nextInt();
                        root = bst.insert(root, element);
                        System.out.println("Root-->"+(root!=null?root.data:"null"));
                    }
                    break;
                    
                case 2:
                    System.out.println("Pre-order traversal:");
                    bst.preOrder(root);
                    break;
                    
                case 3:
                    System.out.println("In-order traversal:");
                    bst.inOrder(root);
                    break;
                    
                case 4:
                    System.out.println("Post-order traversal:");
                    bst.postOrder(root);
                    break;
                    
                case 5:
                    System.out.print("Enter element to search in Bst: ");
                    element = sc.nextInt();
                    boolean status = bst.search(root, element);
                    System.out.println("Element found: " + status);
                    break;
                    
                case 6:
                    System.out.print("Enter element to delete (no child): ");
                    element = sc.nextInt();
                    root = bst.deleteNodeNoChild(root, element);
                    break;
                    
                case 7:
                    System.out.print("Enter element to delete (one child): ");
                    element = sc.nextInt();
                    root = bst.deleteNodeOneChild(root, element);
                    break;
                    
                case 8:
                    System.out.print("Enter element to delete (both children): ");
                    element = sc.nextInt();
                    root = bst.deleteNodeBothChild(root, element);
                    break;
      
                case 9:
                    return;
                    
                default:
                    System.out.println("Invalid choice, try again...");
            }
        } while (true);
    }
}
