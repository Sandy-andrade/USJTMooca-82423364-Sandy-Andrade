import javax.swing.JOptionPane;
public class Solucao1k
{
  public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite um número:");
      
       //convertendo para inteiro
      int numero = Integer.parseInt(numero1);  
       
      //verificando se é divisível por 3
      if (numero % 3 == 0) { 
      JOptionPane.showMessageDialog(null, "É divisível por 3.");
      
      } else {
      JOptionPane.showMessageDialog(null, "Não é divisível por 3.");
      }
      
      // Verificando se o número é divisivel por 7
      if (numero % 7 == 0) { 
      JOptionPane.showMessageDialog(null, "É divisível por 7.");
      
      } else {
      JOptionPane.showMessageDialog(null, "Não é divisível por 7.");
      }
   }            
}  


