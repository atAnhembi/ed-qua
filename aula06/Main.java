public class Main {
    public static void main(String[] args) {
        MyList<String> lista = new MyList<>();

        System.out.println(lista.show());

        lista.add("1");
        lista.add("2");
        lista.add("3");
        
        try {
            lista.removeLast();
            System.out.println(lista.show());
            lista.removeLast();
            System.out.println(lista.show());
            lista.removeLast();
            System.out.println(lista.show());
            lista.removeLast();
            System.out.println(lista.show());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
