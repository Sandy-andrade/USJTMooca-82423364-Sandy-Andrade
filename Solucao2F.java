import javax.swing.JOptionPane;
public class Solucao1f
{
  public static void main(String[] args)
  {
    
      String umNumero = JOptionPane.showInputDialog(
      "Por Favor, Digite um número:");
      
      //convertendo para inteiros 
      int numero = Integer.parseInt(umNumero);
      
      //verificando o numero 
      if (numero > 20) {
      JOptionPane.showMessageDialog(null, "O número é maior que 20.");       
      } 
      if (numero == 20) {
      JOptionPane.showMessageDialog(null, "O número é igual a 20.");
      }
      if (numero < 20) {
      JOptionPane.showMessageDialog(null, "O número é menor que 20."); 
      }
   }            
}  


