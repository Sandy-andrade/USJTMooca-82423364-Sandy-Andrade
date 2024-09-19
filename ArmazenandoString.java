import javax.swing.JOptionPane;
public class ArmazenandoString
{
  public static void main(String[] args)
  {
    
      String milharString = JOptionPane.showInputDialog(
      "Digite o numero da milhar,:");
      String centenaString = JOptionPane.showInputDialog(
      "Digite o numero da centena,,:");
      String dezenaString = JOptionPane.showInputDialog(
      "Digite o numero da dezena,:");
      String unidadeString = JOptionPane.showInputDialog(
      "Digite o numero da unidade.,:");
      
      //concatenando os caracteres das String
      String resultado = milharString + centenaString + dezenaString + unidadeString;
      
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "O numero formado é: " + resultado); 
  }
}  


