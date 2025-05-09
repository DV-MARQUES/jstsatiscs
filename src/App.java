import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        int op;

        do {
            String mensagem = "Olá Meu Querido Jardineiro\n" +
                              "Escolha uma opção:\n" +
                              "1 - Cadastrar-se\n" +
                              "2 - Calcular Área\n" +
                              "3 - Sair";

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
                    if(area >= 100){
                        JOptionPane.showMessageDialog(null, "O Resultado foi: " + area+"metros quadrados"+"\n"+"Que jardim Grande");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "O Resultado foi: " + area+"metros"+"\n"+"Que jardim Pequeno");
                        break;
                    }
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Até mais, Jardineiro!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        } while (op != 3); // repete até o usuário escolher sair
    }
}
