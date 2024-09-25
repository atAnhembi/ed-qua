public class DoubleList<T> {
    private Node<T> fisrt, last;

    public boolean isEmpty() {
        return fisrt == null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);

        if(isEmpty()) {
            fisrt = last = newNode;
            return;
        }

        last.setNext(newNode);
        newNode.setPrev(last);
        last = newNode;
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return "Empty";
        }
        String resp = fisrt.getData().toString();
        Node<T> temp = fisrt.getNext();
        while (temp != null) {
            resp += ";" + temp.getData();
            temp = temp.getNext();
        }
        return resp;
    }
}
