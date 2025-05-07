import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int[] espacoAmostral = {1, 2, 3, 4, 5, 6};

        Random random = new Random();

        int pares = 0;
        int impares = 0;
        int soma = 0;
        int totalLancamentos = 0;

        String layout = "Vamo Jogar de Dados:\nDeseja lançar dados?";

        while (true) {
            int opcao = JOptionPane.showConfirmDialog(null, layout, "Lançando os Dados", JOptionPane.YES_NO_OPTION);

            if (opcao != JOptionPane.YES_OPTION) {
                double media = (totalLancamentos > 0) ? (double) soma / totalLancamentos : 0;

                String informacoes = "Jogo Acabado!\n" +
                        "Total de Lançamentos: " + totalLancamentos + "\n" +
                        "Lançamentos Pares: " + pares + "\n" +
                        "Lançamentos Ímpares: " + impares + "\n" +
                        "Média dos lançamentos: " + String.format("%.2f", media);

                JOptionPane.showMessageDialog(null, informacoes, "Jogo Acabado", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            int resultado = random.nextInt(6); // de 0 a 5
            int valor = espacoAmostral[resultado];

            soma += valor;
            totalLancamentos++;

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            String saida = "Resultado do lançamento: " + valor;
            JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
