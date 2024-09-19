import javax.swing.JOptionPane;
public class LerOsCaracteres
{
  public static void main(String[] args)
  {
    
      String primeiraString = JOptionPane.showInputDialog(
      "Digite a primeira String:");
      String segundaString = JOptionPane.showInputDialog(
      "Digite a segunda String:");
      String terceiraString = JOptionPane.showInputDialog(
      "Digite a terceira String:");
      String quartaString = JOptionPane.showInputDialog(
      "Digite a quarta String:");
      String quintaString = JOptionPane.showInputDialog(
      "Digite a quinta String:");
      String sextaString = JOptionPane.showInputDialog(
      "Digite a sexta String:");
      String setimaString = JOptionPane.showInputDialog(
      "Digite a setima String:");
      String oitavaString = JOptionPane.showInputDialog(
      "Digite a oitava String:");
      String nonaString = JOptionPane.showInputDialog(
      "Digite a nona String:");
      String decimaString = JOptionPane.showInputDialog(
      "Digite a decima String:");
      

      String palavraFinal = primeiraString +segundaString +terceiraString +quartaString  
      +quintaString +sextaString +setimaString +oitavaString +nonaString +decimaString ;
      
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "A palavra formada é: " + palavraFinal); 
  }
}  


