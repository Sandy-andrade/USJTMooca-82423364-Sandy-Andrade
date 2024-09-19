import javax.swing.JOptionPane;
public class ContaCaracteres
{
  public static void main(String[] args)
  {
    
    String primeiraString = JOptionPane.showInputDialog(
      "Digite a primeira String:");
    String segundaString = JOptionPane.showInputDialog(
      "Digite a segunda String:");
    String terceiraString = JOptionPane.showInputDialog(
      "Digite a terceira String:");
      
    //obtendo o tamanho da primeira string
    int tamanhoPrimeiraString = primeiraString.length();
    int tamanhoSegundaString = segundaString.length();
    int tamanhoTerceiraString = terceiraString.length();
    
    //calculando o resultado
    int tamanhoTotalString = tamanhoPrimeiraString +tamanhoSegundaString +tamanhoTerceiraString;
    
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "TAMANHO TOTAL = " + tamanhoTotalString); 
  }
}       