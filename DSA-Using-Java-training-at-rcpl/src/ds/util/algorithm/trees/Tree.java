package ds.util.algorithm.trees;
import java.util.ArrayList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
               "data=" + data +
               ", left=" + (left != null ? left.data : "null") +
               ", right=" + (right != null ? right.data : "null") +
               '}';
    }
}

public class Tree implements TreeOperations {
    TreeNode root;

    Tree() {
        this.root = null;
    }

    @Override
    public TreeNode createBst() {
        return root;
    }

    @Override
    public TreeNode insert(TreeNode root, int element) {
        if (root == null) {
        	
            return new TreeNode(element);
        }

        if (element == root.data) {
            System.out.println("Duplicate not allowed");
        } else if (element < root.data) {
            root.left = insert(root.left, element);
        } else {
            root.right = insert(root.right, element);
        }
      ///trace the tree formation
        System.out.println("\nTree Structure:");
        printTree(root, "", false);
        
        System.out.println("\nTree Description:");
        describeTree(root, (root != null ? root.data : null));
      ///trace the tree formation
        return root;
        
    }


    @Override
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    @Override
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    @Override
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    @Override
    public boolean search(TreeNode root, int element) {
        if (root == null) {
            return false;
        }
        if (root.data == element) {
            return true;
        } else if (element < root.data) {
            return search(root.left, element);
        } else {
            return search(root.right, element);
        }
    }

    @Override
    public TreeNode deleteNodeNoChild(TreeNode root, int element) {
        if (root == null) {
            System.out.println("No node to be deleted");
            return null;
        }
      //TODO:
        
        if(root!=null) {
        	if(root.data==element) {
        		if(root.left==null && root.right==null) {
        			return null;
        		}
        	}
        }
        
        return root; // Return the root if it's not a leaf node
    }

    @Override
    public TreeNode deleteNodeOneChild(TreeNode root, int element) {
        if (root == null) {
            System.out.println("No node to be deleted");
            return null;
        }
        //TODO:
        return root;
    }

    @Override
    public TreeNode deleteNodeBothChild(TreeNode root, int element) {
        if (root == null) {
            System.out.println("No node to be deleted");
            return null;
        }
      //TODO:
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    
    public void printTree(TreeNode node, String indent, boolean isLeft) {
        if (node != null) {
            System.out.println(indent + (isLeft ? "L--- " : "R--->") + "("+node.data+")");
            printTree(node.left, indent + (isLeft ? "|    " : "     "), true);
            printTree(node.right, indent + (isLeft ? "|    " : "     "), false);
        }
    }

    public void describeTree(TreeNode node, Integer parentValue) {
        if (node != null) {
            if (parentValue == null) {
                System.out.println("Root Node: " + node.data + " is the root.");
            } else {
                if (node.data < parentValue) {
                    System.out.println("Left Child of " + parentValue + ": " + node.data + " is the left child of " + parentValue + ".");
                } else {
                    System.out.println("Right Child of " + parentValue + ": " + node.data + " is the right child of " + parentValue + ".");
                }
            }
            describeTree(node.left, node.data);
            describeTree(node.right, node.data);
        }
    }


    

   
}
