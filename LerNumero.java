import javax.swing.JOptionPane;
public class LerNumero
{
  public static void main(String[] args)
  {
    
    String numString = JOptionPane.showInputDialog(
      "Digite um numero inteiro:");
    
    //calculando o resultado
    int numero = Integer.parseInt(numString);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "O valor do Numero digitado é: " + numero); 
  }
}       
