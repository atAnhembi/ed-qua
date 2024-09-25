public class Main {
    public static void main(String[] args) {
        DoubleList<String> lista = new DoubleList<>();

        lista.insert("Audi");
        lista.insert("BMW");
        lista.insert("Ferrari");
        
        System.out.println(lista);
    }
}
