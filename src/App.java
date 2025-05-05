import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception{
         System.out.println("Aula3- Switch e Loops");
         // O switch é uma estrutura de seleção múltipla
         // Um if mais organizado
         // Escolha
          // Caso
        // Para resolver listas ou constantes
          //Menu
           //opcao1
           //opcao2 
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: 1-Estatítica Descritiva 2-Probabilidade 3-Modelos Probabilísticos"));
        switch(op){
            case 1:JOptionPane.showMessageDialog( null, 
            "Estatística Descritiva");break;

            case 2:JOptionPane.showMessageDialog( null, 
            "Probabilidade");break;

            case 3:JOptionPane.showMessageDialog( null, 
            "Modelos Probabilísticos");break;

            default:
            JOptionPane.showMessageDialog(null, 
             "Opção Invalida");break;
        }
    }  
} 