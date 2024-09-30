import javax.swing.JOptionPane;
public class Solucao1V
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
      
       //armazenando o maior numero na variável
      int maior; 
      
      //determinando o maior numero      
      if (num1 > num2 && num1 > num3) { 
          maior = num1;
      } else if (num2 > num1 && num2 > num3) {
          maior = num2;
      } else {
          maior = num3;
      }          
      //calculando o maior número
      JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
   }            
}  


