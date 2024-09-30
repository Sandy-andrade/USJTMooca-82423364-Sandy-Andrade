import javax.swing.JOptionPane;
public class Solucao1h
{
  public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite o primeiro número:");
      
      String numero2 = JOptionPane.showInputDialog(
      "Digite o segundo número:");
      
       
       //convertendo para inteiro
      int num1 = Integer.parseInt(numero1);
      int num2 = Integer.parseInt(numero2);  
       
      //determinando o maior numero 
      int maior;
      
      if (num1 > num2) { 
          maior = num1;
      
      } else {
          maior = num2;
      }
      
      // exibindo maior número    
      JOptionPane.showMessageDialog(null, "O Número maior é:" + maior);
 
   }            
}  


