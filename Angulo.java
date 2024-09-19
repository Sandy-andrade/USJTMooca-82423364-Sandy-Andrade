import javax.swing.JOptionPane;
public class Angulo
{
  public static void main(String[] args)
  {
    
    String anguloString = JOptionPane.showInputDialog(
      "Digite o angulo em graus:");
      
      //convertendo String para Double
    double angulo = Double.parseDouble(anguloString);
    double anguloRadiano = Math.toRadians(angulo);
              
    
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "O SENO DO ANGULO É = " +  Math.sin(anguloRadiano) );
    JOptionPane.showMessageDialog(null, "O COSSENO DO ANGULO É = " +  Math.cos(anguloRadiano) );
    JOptionPane.showMessageDialog(null, "O TANGENTE DO ANGULO É = " +  Math.tan(anguloRadiano) );
    JOptionPane.showMessageDialog(null, "O SECANTE DO ANGULO É = " + (1/ Math.cos(anguloRadiano) ));
    JOptionPane.showMessageDialog(null, "O COSSECANTE DO ANGULO É = " + (1/ Math.sin(anguloRadiano) ));
    JOptionPane.showMessageDialog(null, "O COTANGENTE DO ANGULO É = " + (1/ Math.tan(anguloRadiano) ));


  }
}       