import java.util.HashMap;

public class Grafo {
    private HashMap<String, Vertice> vertices;

    public Grafo() {
        vertices = new HashMap<>();
    }

    public void addVertice(String nome) {
        vertices.put(nome, new Vertice(nome));
    }

    public void addAresta(String origem, String destino) {
        if(vertices.containsKey(origem) && vertices.containsKey(destino)) {
            vertices.get(origem).addAdjascentes(destino);
        }
    }

    public String getArestas(String nomeVertice) {
        Vertice vertice = vertices.get(nomeVertice);
        String out = "";
        if(vertice != null) {
            for (String adjascente : vertice.getAdjascentes()) {
                out += "(" + vertice.getNome() + ", " + adjascente + ") ";
            }
        }
        return out;
    }

    public String getArestas() {
        String out = "";

        for (Vertice vertice : vertices.values()) {
            out += vertice.getNome() + ": " + getArestas(vertice.getNome()) + "\n";
        }

        return out;
    }
}
