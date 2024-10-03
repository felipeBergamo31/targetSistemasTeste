// int INDICE = 12, SOMA = 0, K = 1;

// enquanto K < INDICE faça
// { K = K + 1; SOMA = SOMA + K;}
// imprimir(SOMA);
// Resultado:
class Resposta1 {

    public void main(String[] args) {
        calculaSoma();
    }

    void calculaSoma() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }
}

// Ao final do processamento, o valor da variável SOMA será 77.
