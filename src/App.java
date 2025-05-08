import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Classe é um conjunto de objetos
        //nosso objetivo nesse código é entender a diferença 
        //entre método com o tipo de void
        //Criando dados da Vaca
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        JOptionPane.showMessageDialog(null, "Nome Cientifico"+m1.getNomeCientifico());

        //Crinado dados do Canguru
        Mamifero m2 = new Mamifero();
        m2.setNomeCientifico("Macropus fuliginosus");
        JOptionPane.showMessageDialog(null, "Nome Cientifico"+m2.getNomeCientifico());

        //Criando dados do Peixe-Boi
        Mamifero m3 = new Mamifero();
        m3.setNomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null, "Nome Cientifico"+m3.getNomeCientifico());
    }
}
