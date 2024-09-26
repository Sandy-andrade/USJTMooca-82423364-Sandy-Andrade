import javax.swing.JOptionPane;
public class Solucao1b
{
  public static void main(String[] args)
  {
    
      String numeroUm = JOptionPane.showInputDialog(
      "Digite o primeiro numero:"); 

      String numeroDois = JOptionPane.showInputDialog(
      "Digite o segundo numero:");
      
      //convertendo para inteiro 
      int valor1 = Integer.parseInt(numeroUm);      
      int valor2 = Integer.parseInt(numeroDois);
      
      //calculando a soma
      int resultado = valor1 + valor2;
      
      //verificando se a soma é menor ou iguak a 20
      if (resultado <= 20){
      //subtrair 5 se a soma for menor ou igual a 20
      resultado -= 5;
      }
         
      //apresentando o resultado   
      JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
              
   }
}  


