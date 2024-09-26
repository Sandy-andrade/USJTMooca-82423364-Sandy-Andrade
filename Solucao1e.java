import javax.swing.JOptionPane;
public class Solucao1e
{
  public static void main(String[] args)
  {
    
      String umNumero = JOptionPane.showInputDialog(
      "Digite um número:");
      
      //convertendo para inteiros 
      int numero = Integer.parseInt(umNumero);
      
      //verificando o numero 
      if (numero >= 20 && numero <=90){ 
      JOptionPane.showMessageDialog(null, "O número esta entre 20 e 90.");       

      } else {
      JOptionPane.showMessageDialog(null, "O número não está entre 20 e 90.");
     } 
   }            
}  


