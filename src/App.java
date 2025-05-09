import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class App {
    public static void main(String[] args)throws Exception {
    
    // A mensagem a ser exibida   
    String mensagem= "Olá Meu Querido Jardineiro"+"\n"+
                     "Deseja se Cadastrar";
    
    // A janela a ser exibida
    while(true){
    int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Floralchic" , JOptionPane.YES_NO_OPTION);
  
     if(opcao != JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Até mais Jardineiro");
        break;
     }else{
        String nome = JOptionPane.showInputDialog(null,"Digite seu Nome pequeno Jardineiro: ");
        String endereco = JOptionPane.showInputDialog(null, "Digite seu Endenreço: ");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("dadod",true))){
            writer.write("Nome: "+nome+ "Endereço: "+endereco);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error ao gravar Dados"+ e.getMessage());
        }
     }
    } 
   } 
}
