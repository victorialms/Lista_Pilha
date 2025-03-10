class ListaArray {
    private int[] array;
    private int tamanho;

    public ListaArray(int capacidade) {
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    public void adicionarEmPosicao(int elemento, int posicao) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }

        for (int i = tamanho; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        tamanho++;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
    }

    public void imprimirLista() {
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class TesteLista {
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(5);
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimirLista();

        lista.adicionarEmPosicao(25, 1); // Adiciona o elemento 25 na posição 1
        lista.imprimirLista();

        lista.remover(1); // Remove o elemento na posição 1
        lista.imprimirLista();
    }
}
