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

    public String preOrder() {
        return preOrder(root);
    }

    private String preOrder(Node node) {
        if(node == null) return "";

        String out = "";

        out += node.getData() + " ";
        out += preOrder(node.getLeft());
        out += preOrder(node.getRight());

        return out;
    }

    public String posOrder() {
        return posOrder(root);
    }

    private String posOrder(Node node) {
        if(node == null) return "";

        String out = "";

        out += posOrder(node.getLeft());
        out += posOrder(node.getRight());
        out += node.getData() + " ";

        return out;
    }

    // Exercício
    public boolean exists(int value) {
        if(isEmpty()) {
            return false;
        }

        Node aux = root;

        while(aux != null) {
            if(aux.getData() == value) { 
                return true;
            }

            if(aux.getData() > value) {
                aux = aux.getLeft();
            } else {
                aux = aux.getRight();
            }
        }
        return false;
    }
}
