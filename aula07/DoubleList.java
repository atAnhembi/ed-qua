public class DoubleList<T> {
    private Node<T> first, last;
    private int size;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);

        size++;

        if(isEmpty()) {
            first = last = newNode;
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
        String resp = first.getData().toString();
        Node<T> temp = first.getNext();
        while (temp != null) {
            resp += ";" + temp.getData();
            temp = temp.getNext();
        }
        return resp;
    }

    public T removeLast() {
        if(isEmpty()) {
            return null;
        }
        T data = last.getData();
        last = last.getPrev();

        if(last == null) {
            first = null;
        } else {
            last.setNext(null);
        }
        size--;
        return data;
    }

    /* Exercícios  */

     // retorna o valor que está em uma certa posição, sem remover
     // OBS: Validar a posição
     public T get(int position) {
        return null;
     }
     // Verifica se um dado está presente na lista
    public boolean exists(T data) {
        return false;
    }

    // adiciona um dado em uma posição específica
    // precisa validar a posição
    public void add(T data, int position) {

    }

    // remove um data caso ele exista na lista
    public boolean remove(T data) {
        return false;
    }

    // remove o dado que estiver em uma determinada posição
    public T remove(int position) {
        return null;
    }

    // altera o dado que está em uma posição
    public void set(T data, int position) {

    }
}
