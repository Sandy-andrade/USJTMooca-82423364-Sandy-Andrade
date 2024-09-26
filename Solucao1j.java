import javax.swing.JOptionPane;
public class Solucao1j
{
  public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite um número:");
      
       //convertendo para inteiro
      int numero = Integer.parseInt(numero1);  
       
      //verificando se é multiplo de 3
      if (numero % 5 == 0) { 
      JOptionPane.showMessageDialog(null, "É divisível por 5.");
      
      } else {
      JOptionPane.showMessageDialog(null, "Não é divisível por 5.");
      }
   }            
}  


