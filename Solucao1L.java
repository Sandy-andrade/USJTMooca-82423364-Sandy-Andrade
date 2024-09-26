import javax.swing.JOptionPane;
public class Solucao1L
{
  public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite um número:");
      
       //convertendo para inteiro
      int numero = Integer.parseInt(numero1);  
       
      //verificando se o número é divisível por 10
      if (numero % 10 == 0) { 
      JOptionPane.showMessageDialog(null, "É divisível por 10.");
      } else if (numero % 5 == 0) {
      JOptionPane.showMessageDialog(null, "É divisível por 5.");      
      } else if (numero % 2 == 0) {
      JOptionPane.showMessageDialog(null, "É divisível por 2.");
      } else {
      JOptionPane.showMessageDialog(null, "Não é divisível por 10, 5 e nem por 2.");
      }
   }            
}  


