import javax.swing.JOptionPane;
public class Solucao1S 
{
public static void main(String[] args)
  {
    
      String num1 = JOptionPane.showInputDialog(
      "Digite o primeiro número:");
      
      String num2 = JOptionPane.showInputDialog(
      "Digite o segundo número:");
      
       //convertendo para inteiro
      int numero1 = Integer.parseInt(num1);
      int numero2 = Integer.parseInt(num2); 
      
      //Imprimi em ordem decrescente
      if (numero1 > numero2) { 
      JOptionPane.showMessageDialog(null, "Ordem decrescente:" + numero1 + "," + numero2);
      } else {
      JOptionPane.showMessageDialog(null, "Ordem decrescente:" + numero2 + "," + numero1);
      }
   }            
}  

