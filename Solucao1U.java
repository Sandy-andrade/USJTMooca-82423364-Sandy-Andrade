import javax.swing.JOptionPane;
public class Solucao1U
{
public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite o primeiro número:");
      
      String numero2 = JOptionPane.showInputDialog(
      "Digite o segundo número:");
      
      String numero3 = JOptionPane.showInputDialog(
      "Digite o terceiro número:");
      
      //convertendo para int
      int num1 = Integer.parseInt(numero1);
      int num2 = Integer.parseInt(numero2);
      int num3 = Integer.parseInt(numero3);
      
       //determinando o maior número
      int maior = Math.max(num1, Math.max (num2, num3)); 
      
      //calculando o maior número
      JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
   }            
}  


