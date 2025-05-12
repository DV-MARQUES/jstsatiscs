import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        int op;
        int qtdDesconto = 0; // agora visível para todos os cases
        int preco = 0;
        int qtdArea = 0;
        int somaArea = 0;
        int jarGrande = 0;
        int jarPequeno = 0;

        do {
            String mensagem = "Olá Meu Querido Jardineiro\n" +
                              "Escolha uma opção:\n" +
                              "1 - Cadastrar-se\n" +
                              "2 - Calcular Área\n" +
                              "3 - Tipo de Serviço\n" +
                              "4 - Sair";

            op = Integer.parseInt(JOptionPane.showInputDialog(mensagem));

            switch (op) {
                case 1:
                    String nome = JOptionPane.showInputDialog(null, "Digite seu Nome, Pequeno Jardineiro:");
                    String endereco = JOptionPane.showInputDialog(null, "Digite seu Endereço:");

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))) {
                        writer.write("Nome: " + nome + "\n" + "Endereço: " + endereco + "\n");
                        writer.write("---------------\n");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e.getMessage());
                    }
                    break;

                case 2:
                    int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a largura do Jardim:"));
                    int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o comprimento do Jardim:"));
                    int area = largura * comprimento;
                    if (area >= 100) {
                        JOptionPane.showMessageDialog(null, "O Resultado foi: " + area + " metros quadrados\nQue jardim Grande");
                        qtdArea++;
                        somaArea += area;
                        jarGrande++;
                    } else {
                        JOptionPane.showMessageDialog(null, "O Resultado foi: " + area + " metros quadrados\nQue jardim Pequeno");
                        qtdArea++;
                        somaArea += area;
                        jarPequeno++;
                    }
                    break;

                case 3:
                    String mensagemServico = "Escolha um Tipo de Serviço: \n" +
                                             "1 - Manutenção (R$250)\n" +
                                             "2 - Poda (R$50)\n" +
                                             "3 - Controle de Doenças e Pragas (R$300)\n" +
                                             "4 - Limpeza (R$80)\n" +
                                             "5 - Adubar (R$5)";
                    int se = Integer.parseInt(JOptionPane.showInputDialog(mensagemServico));

                    switch (se) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Vamos prestar a Manutenção");
                            qtdDesconto++;
                            preco += 250;
                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "Vamos fazer a poda");
                            qtdDesconto++;
                            preco += 50;
                            break;

                        case 3:
                            JOptionPane.showMessageDialog(null, "Vamos fazer Controle de Doenças e Pragas");
                            qtdDesconto++;
                            preco += 300;
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(null, "Vamos fazer a Limpeza");
                            qtdDesconto++;
                            preco += 80;
                            break;

                        case 5:
                            JOptionPane.showMessageDialog(null, "Vamos adubar sua terra");
                            qtdDesconto++;
                            preco += 5;
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Serviço não encontrado");
                            break;
                    }
                    break;

                case 4:
                    float mediaArea = somaArea/qtdArea;
                    float total = (qtdDesconto / 100.0f) * preco;
                    String mensagemFinal = String.format("Estatísticas:\n" +
                            "Preço dos Serviços: R$%.2f\n" +
                            "Desconto: %d%%\n" +
                            "Preço Total: R$%.2f\n" +
                            "Media Das Areas Do Jardins: %.2f\n" +
                            "Quantidades de Jardins Grandes: %d\n" +
                            "Quantidade de Jardins Pequenos: %d\n", (float) preco, qtdDesconto, (preco - total), mediaArea, jarGrande, jarPequeno);
                    JOptionPane.showMessageDialog(null, mensagemFinal);
                    JOptionPane.showMessageDialog(null, "Ate Mais Jardineiro");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        } while (op != 4); // repete até o usuário escolher sair
    }
}
