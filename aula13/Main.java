public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.println("IsEmpty? " + tree.isEmpty());
        
        
        System.out.println("IsEmpty? " + tree.isEmpty());
        
        tree.add(7);
        tree.add(5);
        tree.add(10);
        tree.add(2);
        tree.add(2);
        tree.add(6);
        tree.add(8);
        tree.add(12);
        tree.add(9);

        System.out.println(tree.preOrder());
        System.out.println(tree.inOrder());
        System.out.println(tree.posOrder());

        System.out.println("Achou 8: " + tree.exists(8));
        System.out.println("Achou 18: " + tree.exists(18));
    }
}
