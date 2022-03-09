public class BinarySearchTree {
    MyNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    MyNode insertRec(MyNode root, int key) {

        if (root == null) {
            root = new MyNode(key);
            return root;
        }
        if (key < root.key)
        {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }


    public void inorder() {
        inorderRec(root);
    }

    void inorderRec(MyNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }

    MyNode deleteRec(MyNode root, int key)
    {
        if (root == null)
        {
            return root;
        }
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        }
        else
        {
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }
    public int minValue(MyNode root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }


    public MyNode search(MyNode root, int key)
    {
        if (root==null || root.key==key)
        {
            return root;
        }
        if (root.key > key)
        {
            return search(root.left, key);
        }
        return search(root.right, key);
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
        System.out.println();
        tree.deleteKey(50);
        System.out.println("After deleting ");
        tree.inorder();
    }
}
