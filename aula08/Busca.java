public class Busca {
    private static int cont;

    public static int getCont() {
        return cont;
    }

    public static int sequencial(int[] vet, int chave) {
        cont = 0;
        for (int i = 0; i < vet.length; i++) {
            cont++;
            if(vet[i] == chave) {
                return i;
            }
        }
        return -1;
    }

    public static int binario(int[] vet, int chave) {
        int inicio = 0;
        int fim = vet.length;
        int meio;

        cont = 0;

        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            cont++;
            if(vet[meio] == chave) {
                return meio;
            }
            cont++;
            if(vet[meio] > chave) {
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }
}
