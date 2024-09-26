public class Main {
    public static void main(String[] args) {
        DoubleList<String> lista = new DoubleList<>();

        lista.insert("Audi");
        lista.insert("BMW");
        lista.insert("Ferrari");
        
        System.out.println(lista + " com tamanho " +lista.size());
        
        while (!lista.isEmpty()) {
            System.out.println("Removeu: " + lista.removeLast());
            System.out.println(lista + " com tamanho " +lista.size());
        }
    }
}
