import javax.swing.JOptionPane;
public class Solucao1M
{
  public static void main(String[] args)
  {
    
      String numeroInteiro = JOptionPane.showInputDialog(
      "Digite um número inteiro de 3 dígitos:");
      
       //convertendo para inteiro
      int numero = Integer.parseInt(numeroInteiro); 
      
      //qual é o algarismo da casa das dezenas
      int dezenas = (numero / 10) % 10;
       
      //verificando se o algarismo é par ou ímpar
      if (dezenas % 2 == 0) { 
      JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é par.");
      } else {
      JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é ímpar.");
      }
   }            
}  


