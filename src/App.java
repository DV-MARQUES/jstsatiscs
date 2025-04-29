import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t JEstatitics");
        // Aplicando Lógica de Programação (Aristoteles e Geroge Boolean)
        Scanner leia = new Scanner(System.in);
        // Variável: é um espaço reservado na mémoria do computador
        // Variável: serve para guardar valores
        // Variável: ela tem um tipo (texto, número, lógico ...)
        /*
        *
        * Ex-1: crie um algoritmo para o JStatitics que leia
        * a opção desejada:
        * "Qual o conjunto de dados utilizados: 1- populacional 2- amostral"
        * o valor recebido deve ser um valor inteiro
        * 
        */
        /* 
        int opcao; // declarei a variável em Java.
        System.out.println("\t #--- \t #--- \t JStstitics \t #--- \t #--- \t");
        System.out.println("Qual o conjunto de dados utilizados: 1- populacional 2- amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);
        */
        int opcao;
        JOptionPane.showMessageDialog(null,"O Jogo da Estatisticas: JStatitics ");
  
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o Jogo? \n Escolha a estragegia: \n 1- Populacional \n 2- Amostral"));

        JOptionPane.showMessageDialog(null, "Você Escolheu: "+opcao, "JStatitics", JOptionPane.DEFAULT_OPTION);

        String opcaoVariavel = JOptionPane.showInputDialog(null,"Que tipo de variável ele deseja cadrastar: \n 1- Quantitativa \n 2- Qualitativa ");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null,"Sua Escolha Foi: "+opVariavel, "JStatitics", JOptionPane.DEFAULT_OPTION);
;    }
}
