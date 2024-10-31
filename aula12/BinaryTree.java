public class BinaryTree {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(int value) {
        Node newNode = new Node(value);

        if(isEmpty()) {
            root = newNode;
            return true;
        }

        Node aux = root;
        Node previous;

        while(aux != null) {
            previous = aux;
            if(aux.getData() == value) { // não pode iserir duplicado
                return false;
            }

            if(aux.getData() > value) {
                aux = aux.getLeft();
                if(aux == null) {
                    previous.setLeft(newNode);
                }
            } else {
                aux = aux.getRight();
                if(aux == null) {
                    previous.setRight(newNode);
                }
            }

        }
        return true;
    }

    public String inOrder() {
        return inOrder(root);
    }

    private String inOrder(Node node) {
        if(node == null) return "";

        String out = "";

        out += inOrder(node.getLeft());
        out += node.getData() + " ";
        out += inOrder(node.getRight());

        return out;
    }

    // Exercício
    public boolean exists(int valor) {
        return true;
    }
}
