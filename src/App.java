import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3 - Switch e Loops");

        // Menu com switch
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a opção:\n1 - Estatística Descritiva\n2 - Probabilidade\n3 - Modelos Probabilísticos"
        ));

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Estatística Descritiva");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Probabilidade");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Modelos Probabilísticos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }

        String escolha;
        do{
            System.out.println( "Deseja escolher outra opção");
            escolha = JOptionPane.showInputDialog("Digite s-sim ou n-não");
        }while(escolha != "n"); {
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Estatística Descritiva");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Probabilidade");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Modelos Probabilísticos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
        }

        JOptionPane.showMessageDialog(null, "Encerrado Sistema");
        

        // Loop while
        /* 
        int contador = 1;
        while (contador <= 5) {
            JOptionPane.showMessageDialog(null, "Viva o SENAI");
            contador = contador + 1;
        }
        */
        /* 
        for(int cont=1;cont<=10;cont++){
            System.out.println(cont);
        }
        */

        String sair;
        do{
            System.out.println( "sair: s ou n");
            sair = JOptionPane.showInputDialog("Digite s-sim ou n-não");
        }while(sair != "n");
    }
}
}

