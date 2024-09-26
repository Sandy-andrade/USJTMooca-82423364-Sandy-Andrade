import javax.swing.JOptionPane;
public class Solucao1a
{
  public static void main(String[] args)
  {
    
      String primeiroNumero = JOptionPane.showInputDialog(
      "Digite o primeiro valor inteiro,:"); 

      String segundoNumero = JOptionPane.showInputDialog(
      "Digite o segundo valor inteiro,:");
      
      //convertendo para inteiro 
      int valor1 = Integer.parseInt(primeiroNumero);      
      int valor2 = Integer.parseInt(segundoNumero);
      
      //calculando a soma
      int soma = valor1 + valor2;
      
      //verificando se a soma é maior que 10
      if (soma > 10){
         JOptionPane.showMessageDialog(null, "A soma é: " + soma);
      }
      else {
         JOptionPane.showMessageDialog(null, "A soma é maior ou igual a 10");
      }     
   }
}  


