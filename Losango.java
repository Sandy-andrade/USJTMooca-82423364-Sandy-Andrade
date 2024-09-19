import javax.swing.JOptionPane;
public class Losango
{
  public static void main(String[] args)
  {
        
     String d1String = JOptionPane.showInputDialog(
      "Digite a diagonal 1:");
      String d2String = JOptionPane.showInputDialog(
      "Digite a diagonal 2:");

                   
       //pegando as informacoes da data
    double d1 = Double.parseDouble(d1String);
    double d2 = Double.parseDouble(d2String); 
    
    
    double area = 1.0 / 2.0 * d1 * d2;

         
    String resultado = String.format("A area é %s", area);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       