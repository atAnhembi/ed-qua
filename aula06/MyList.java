
public class MyList<T> {
    private Node<T> first, last;

    public boolean isEmpty() {
        return first == null;
    }
    
    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(isEmpty()) {
            first = last = newNode;
            return;
        }

        last.setNext(newNode);
        last = newNode;
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);

        if(isEmpty()) {
            first = last = newNode;
            return;
        }

        newNode.setNext(first);
        first = newNode;
    }

    public T removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Erro: Lista vazia");
        }

        Node<T> aux = first;
        first = first.getNext();

        if(first == null) {
            last = null;
        }
        return aux.getData();
    }

    public T removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Erro: Lista vazia");
        }

        if(first == last) {
            T data = first.getData();
            first = last = null;
            return data;
        }

        Node<T> aux = first;
        while (aux.getNext() != last) {
            aux = aux.getNext();
        }
        
        T data = last.getData();
        last = aux;
        last.setNext(null);

        return data;
    }


    public String show() {
        if(isEmpty()) {
            return "Lista vazia";
        }
        String result = "";
        Node<T> aux = first;

        while (aux != null) {
            result += aux.getData() + ",";
            aux = aux.getNext();
        }
        return result;
    }


    // *** Exercícios ***

    public boolean exists(T data) {
        return false;
    }

    public int size() {
        return 0;
    }

    public void add(T data, int position) {

    }

    public boolean remove(T data) {
        return false;
    }

    public T remove(int position) {
        return null;
    }

    public void set(T data, int position) {

    }

    public T get(int position) {
        return null;
    }

}