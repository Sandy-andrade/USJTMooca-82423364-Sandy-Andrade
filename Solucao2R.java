import javax.swing.JOptionPane;
public class Solucao1R 
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
      
      //Imprimi em ordem crescente
      if (numero1 < numero2) { 
      JOptionPane.showMessageDialog(null, "Ordem crescente:" + numero1 + "," + numero2);
      } else {
      JOptionPane.showMessageDialog(null, "Ordem crescente:" + numero2 + "," + numero1);
      }
   }            
}  


