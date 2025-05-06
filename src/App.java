import java.util.Random;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //Cara ou Cora
        //Variável que receba uma interação do jogo
        //Random
        //Switch
        //For , do While e While
        String[] espacoAmostral = {"Cara","Coroa"};

        //Objeto Random
        //Sorteio
        Random random = new Random();

        //Contadores para verificar adistribuição
        int contCara = 0;
        int contCoroa = 0;
        String mensagem= "Espaço amostral:{Cara,Coroa}\n"+
                          "Probabilidade de Cara: 50% \n"+
                          "Probabilidade de Coroa: 50% \n"+
                          "Deseja lançar a moeda?";
                // loop de lançamento
                while(true){
                    int opcao = JOptionPane.showConfirmDialog(null,mensagem,"Lançando moeda", JOptionPane.YES_NO_OPTION);
                    if(opcao != JOptionPane.YES_OPTION){
                        
                       //Estatísticas
                       String estatisticas = "Jogo finalizado!\n"+
                       "Total de lançamnetos: "+(contCara+contCoroa)+"\n"+
                       "Caras: "+contCara+"\n"+
                       "Coroas: "+contCoroa;
                       JOptionPane.showMessageDialog(null, estatisticas, "Finalizado Jogo", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    }
                    int resultado = random.nextInt(2);
                    if(resultado == 0){
                        contCara++;    
                    }else{
                        contCoroa++;
                    }
                    String saida = "Resultado do lançamento:"+espacoAmostral[resultado]+
                                   "\n(Indice gerado:"+resultado+")";
                    JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);               
                }             
    }
}
