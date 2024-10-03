public class Main {
    public static void main(String[] args) {
        final int TAM_MAX = 2_000_000_000;
        int[] vet =new int[TAM_MAX];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
        }

        int chave = (int) (Math.random() * TAM_MAX);

        long inicio = System.currentTimeMillis();
        int posicao = Busca.sequencial(vet, chave);
        long fim = System.currentTimeMillis();
        System.out.println("Achou: " + chave + " na posição " + posicao);
        System.out.println("Levou " + (fim - inicio) + " ms");
        System.out.println("Contou: " + Busca.getCont());

        inicio = System.currentTimeMillis();
        posicao = Busca.binario(vet, chave);
        fim = System.currentTimeMillis();
        System.out.println("Achou: " + chave + " na posição " + posicao);
        System.out.println("Levou " + (fim - inicio) + " ms");
        System.out.println("Contou: " + Busca.getCont());
    }
}
