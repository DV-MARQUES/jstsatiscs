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
                    if(area >= 100){
                        JOptionPane.showMessageDialog(null, "O Resultado foi: " + area+"metros quadrados"+"\n"+"Que jardim Grande");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "O Resultado foi: " + area+"metros"+"\n"+"Que jardim Pequeno");
                        break;
                    }
                    
                case 3:  
                    String mesangemServico = "Escolha um Tipo de Serviço: \n" +
                                             "1 - Manutenção" + "Preço: R$250" + "\n" + 
                                             "2 - Poda" + "Preço: R$50" + "\n" + 
                                             "3 - Controle de Doenças e Pragas" + "Preço: R$300" + "\n" +
                                             "4 - Limpeza" + "Preço: R$80" + "\n" +
                                             "5 - Adubar" + "Preço: R$5";
                    int se = Integer.parseInt(JOptionPane.showInputDialog(mesangemServico));
                    int qtdDesconto = 0;
                    int preco = 0;
                    
                     switch (se) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Vamos prestar a Manutenção");
                            qtdDesconto = qtdDesconto + 1;
                            preco = preco + 250;
                            break;
                     
                        case 2:
                            JOptionPane.showMessageDialog(null, "Vamos fazer a poda");
                            qtdDesconto = qtdDesconto + 1;
                            preco = preco + 50;
                            break;
                        
                        case 3:
                            JOptionPane.showMessageDialog(null, "Vamos fazer Controle de Doenças e Pragas");
                            qtdDesconto = qtdDesconto + 1;
                            preco = preco + 300;
                            break;        
                        
                        case 4:
                            JOptionPane.showMessageDialog(null, "Vamos fazer a Limpeza");
                            qtdDesconto = qtdDesconto + 1;
                            preco = preco + 80;
                            break; 

                        case 5:
                            JOptionPane.showMessageDialog(null, "Vamos aduber sua terra");
                            qtdDesconto = qtdDesconto + 1;
                            preco = preco + 5;
                            break; 

                        default:
                            JOptionPane.showMessageDialog(null, "Serviço não encontrado");
                            break;
                     }
                    break;
                case 4:
                    
                    JOptionPane.showConfirmDialog(null, "Estatiticas:" + "\n" + 
                                                 "Preço dos Serviços: " +preco+ "\n" + 
                                                 "Desconto: " +qtdDesconto+ "\n" +
                                                 "Preço Total: " + );
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        } while (op != 4); // repete até o usuário escolher sair
    }
}
