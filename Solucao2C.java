import javax.swing.JOptionPane;
public class Solucao1c
{
  public static void main(String[] args)
  {
    
      String numeroString = JOptionPane.showInputDialog(
      "Digite um numero:"); 

      //convertendo para double 
      double numero = Double.parseDouble(numeroString);      

      //verificando se o numero é positivo ou negativo
      if (numero >= 0) {
      
      //calculando a raiz quadrada
      double raizQuadrada = Math.sqrt(numero);
      JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + raizQuadrada);
      } else {
      
      //calculando o quadrado
      double quadrado = numero * numero;
      
      // apresentando o resultado  
      JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é: " + quadrado);
      }        
   }
}  


