import javax.swing.JOptionPane;
public class Solucao1T
{
public static void main(String[] args)
  {
    
      String numero1 = JOptionPane.showInputDialog(
      "Digite o primeiro número:");
      
      String numero2 = JOptionPane.showInputDialog(
      "Digite o segundo número:");
      
      //convertendo para int
      int num1 = Integer.parseInt(numero1);
      int num2 = Integer.parseInt(numero2);
      
       //determinando o número menor e o maior
      int menor = Math.min(num1, num2);
      int maior = Math.max(num1, num2); 
      
      //calculando o quadrado do menor
      int quadradoMenor = menor * menor;
      
      //calculando a raiz quadrada do maior
      double raizMaior = Math.sqrt(maior);
      
      
      JOptionPane.showMessageDialog(null, "O Quadrado do menor número (" + menor + "): " + quadradoMenor);
      JOptionPane.showMessageDialog(null, "A Raiz quadrada do maior número (" + maior + "): " + raizMaior);
   }            
}  


