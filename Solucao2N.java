import javax.swing.JOptionPane;
public class Solucao1N
{
  public static void main(String[] args)
  {
    
      String numeroInteiro = JOptionPane.showInputDialog(
      "Digite um número inteiro de 4 dígitos:");
      
       //convertendo para inteiro
      int numero = Integer.parseInt(numeroInteiro); 
      
      //Extraindo algarismos
      int unidadeMilhar = numero / 1000;
      int centenas = (numero / 100) % 10;
      
      //Formando novo número
      int novoNumero = unidadeMilhar * 10 + centenas;
       
      //verificando se o novo número é múltiplo de 4
      if (novoNumero % 4 == 0) { 
      JOptionPane.showMessageDialog(null, "O número formado é múltiplo de 4.");
      } else {
      JOptionPane.showMessageDialog(null, "O número formado não é múltiplo de 4.");
      }
   }            
}  


