
public class FaturamentoDistribuidora {

    public void main() {
        double[] faturamentoAnual = {200.0, 0.0, 150.0, 0.0, 100.0, 300.0, 0.0, 500.0, 0.0, 250.0};
        printFaturamento(faturamentoAnual);
    }

    public void printFaturamento(double[] faturamentoAnual) {

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Percorre o vetor e encontra o menor, maior faturamento e soma dos dias com faturamento
        for (double valor : faturamentoAnual) {
            if (valor > 0) { // Ignora dias sem faturamento
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        // Calcula a média anual considerando apenas os dias com faturamento
        double mediaAnual = somaFaturamento / diasComFaturamento;

        // Conta os dias com faturamento acima da média
        int diasAcimaDaMedia = 0;
        for (double valor : faturamentoAnual) {
            if (valor > mediaAnual) {
                diasAcimaDaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Media de faturamento: " + mediaAnual);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
