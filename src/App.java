import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // ternário  ?   :
       
        /* int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma população? \n 1-Parâmetro \n 2-Estátitisca"));
        if(op == 1){
            JOptionPane.showMessageDialog(null,
            "Certa Resposta");
     }else{
        JOptionPane.showMessageDialog(null, "Resposta Errada",
        "JStatístics",JOptionPane.ERROR_MESSAGE);
     }  */ 
     
     /*
        Double op = Double.parseDouble(JOptionPane.showInputDialog("Considerando os números 30,50,80,90 Digite o valor de média aritmética simples?"));
        if(op == 62.5){
            JOptionPane.showMessageDialog(null,
            "Certa Resposta");
     }else{
        JOptionPane.showMessageDialog(null, "Resposta Errada",
        "JStatístics",JOptionPane.ERROR_MESSAGE);
     }             */
        Double op = Double.parseDouble(JOptionPane.showInputDialog("Considerado os valores 10,40,50,80,10. Digite qual é a moda?"));
        if(op == 10){
            JOptionPane.showMessageDialog(null,
            "Certa Resposta");
     }else{
        JOptionPane.showMessageDialog(null, "Resposta Errada",
        "JStatístics",JOptionPane.ERROR_MESSAGE);
     }            

     }  
        }
          
    
    // if else
    // Exercícios(para cada exercício crie um if)
    /*
     * Considerando os números 30,50,80,90 Digite o valor de média aritmética simples?
     * Gabarito: 62,5
     * Considerado os valores 10,40,50,80,10. Digite qual é a moda?
     * Gabarito: 10
     * Qual a medida de têndencia central que mostra o centro da amostra? 
     * mediana
     * 
     * String nome;
     * if nome.equals("mediana")
     * 
     * double resposta = Double.parseDoble()
     * 10 minutos
     * 30 minutos
     * 10:42 -- 11:12 
     */