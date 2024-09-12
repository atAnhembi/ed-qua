
public class Queue <T> {
    private T data[];
    private int end;

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        data = (T[]) new Object[size];
        end = 0;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public int size() {
        return end;
    }

  
    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return data[0];
    }

    public String peekInfo() {
        if(isEmpty()) {
            return "";
        }
        return data[0].toString();
    }

    public boolean enqueue(T paciente) {
        if(isFull()) {
            return false;
        }
        data[end++] = paciente;
        return true;
    }

    public T dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        T paciente = data[0];
        for (int i = 0; i < end - 1; i++) {
            data[i] = data[i+1];
        }
        end--;
        return paciente;
    }

    public String show() {
        String dataQueue = "";

        for (int i = 0; i < end; i++) {
            dataQueue += data[i] + "\n";
        }
        return dataQueue;
    }
}
