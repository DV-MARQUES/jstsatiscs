import javax.swing.JOptionPane;

public class App{

    public static void main(String agrs[]){
      
      //double areaJardim1 = 200.00;
      //double areaJardim2 = 300.00;
      //double areaJardim3 = 500.00;
       

      double[] areasJardins = {200,300,400};
      System.out.println(areasJardins[0]);
      System.out.println(areasJardins[1]);
      System.out.println(areasJardins[2]);
      
       double count = 0;
     

      for(int i = 0;i<areasJardins.length;i++){
        
        JOptionPane.showMessageDialog(null, areasJardins[i]);
        count = count + areasJardins[i];
        
       
      } 
    
      double media = count/areasJardins.length;
      JOptionPane.showMessageDialog(null, media); 
      // 20 JARDINS
      
      // double media = (areaJardim1+areaJardim2+areaJardim3)/3;
      //JOptionPane.showMessageDialog(null, media);
      
    }
}