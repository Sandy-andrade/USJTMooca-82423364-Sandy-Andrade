import javax.swing.JOptionPane;
public class PalavrasContrarias
{
  public static void main(String[] args)
  {
    
    String palavra1 = JOptionPane.showInputDialog(
      "Digite a primeira Palavra:");
    String palavra2 = JOptionPane.showInputDialog(
      "Digite a segunda Palavra:");
    String palavra3 = JOptionPane.showInputDialog(
      "Digite a terceira Palavra:");
      

    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "palavra= " + palavra3 + ", " + palavra2 + ", " + palavra1);
  }
}       