public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.addVertice("1");
        grafo.addVertice("2");
        grafo.addVertice("3");
        grafo.addVertice("4");

        grafo.addAresta("1", "2");
        grafo.addAresta("1", "3");
        grafo.addAresta("1", "4");
        grafo.addAresta("3", "2");

        System.out.println(grafo.getArestas());
    }
}
