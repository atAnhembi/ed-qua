import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String nome;
    private List<String> adjascentes;
    
    public Vertice(String nome) {
        this.nome = nome;
        adjascentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<String> getAdjascentes() {
        return adjascentes;
    }

    public String adjascentes() {
        String saida = nome + ": ";
        for (String vertice : adjascentes) {
            saida += vertice + ", ";
        }
        return saida;
    }

    public void addAdjascentes(String nome) {
        // TODO: verificar se já existe
        adjascentes.add(nome);
    }


}