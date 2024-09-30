import javax.swing.JOptionPane;
public class Solucao1d
{
  public static void main(String[] args)
  {
    
      String primeiroNumero = JOptionPane.showInputDialog(
      "Digite o Primeiro numero:");
      
      String segundoNumero = JOptionPane.showInputDialog(
      "Digite o Segundo numero:");
      
      String terceiroNumero = JOptionPane.showInputDialog(
      "Digite o Terceiro numero:"); 

      //convertendo para inteiros 
      int numero1 = Integer.parseInt(primeiroNumero);
      int numero2 = Integer.parseInt(segundoNumero);
      int numero3 = Integer.parseInt(terceiroNumero); 
      
      //armazenando os numeros em odem 
      int menor, meio, maior;     

      //ordem crescente
      if (numero1 < numero2 && numero1 < numero3) {
          menor = numero1;
      if (numero2 < numero3) {
          meio = numero2;
          maior = numero3;
      } else {
          meio = numero3;
          maior = numero2;
      }
    } else if (numero2 < numero1 && numero2 < numero3) {
          menor = numero2;
      if (numero1 < numero3) {
          meio = numero1;
          maior = numero3;    
      } else {
          meio = numero3;
          maior = numero1;
      }
    } else {
          menor = numero3;
      if (numero1 < numero2) {
          meio = numero1;
          maior = numero2;    
      } else {
          meio = numero2;
          maior = numero1;
      } 
    }            
        // apresentando o resultado  
      JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são:" + menor + ", " + meio + ", " + maior);       
   }
}  


