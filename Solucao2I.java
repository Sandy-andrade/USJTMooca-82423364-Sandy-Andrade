import javax.swing.JOptionPane;
public class Solucao1i
{
  public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite um número:");
      
       //convertendo para inteiro
      int numero = Integer.parseInt(numero1);  
       
      //verificando se é multiplo de 3
      if (numero % 3 == 0) { 
      JOptionPane.showMessageDialog(null, "É múltiplo de 3.");
      
      } else {
      JOptionPane.showMessageDialog(null, "Não é múltiplo de 3.");
      }
   }            
}  


