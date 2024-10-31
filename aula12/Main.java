public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.println("IsEmpty? " + tree.isEmpty());
        
        tree.add(10);
        
        System.out.println("IsEmpty? " + tree.isEmpty());

        tree.add(7);
        tree.add(20);
        tree.add(5);
        tree.add(14);
        tree.add(4);
        tree.add(9);

        System.out.println(tree.inOrder());
    }
}
