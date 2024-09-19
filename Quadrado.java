import javax.swing.JOptionPane;
public class Quadrado
{
  public static void main(String[] args)
  {
    
    String sBase = "";    
    sBase = JOptionPane.showInputDialog(
            "Digite sua Base (apenas numeros inteiros):");
      
    //convertendo para reais
    double baseD = Double.parseDouble(sBase);        
    //calculando o resultado
    double resultado = Math.pow(baseD, 2);
    
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "RESULTADO = " + resultado); 
  }
}       