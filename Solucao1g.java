import javax.swing.JOptionPane;
public class Solucao1g
{
  public static void main(String[] args)
  {
    
      String nome = JOptionPane.showInputDialog(
      "Digite o seu Nome:");
      
      String sexo = JOptionPane.showInputDialog(
      "Digite o seu Sexo:");
      
      String idadeS = JOptionPane.showInputDialog(
      "Digite a sua Idade:");
       
       //convertendo para inteiro
      int idade = Integer.parseInt(idadeS);  
       
      //verificando condiçoes 
      if ((sexo.equalsIgnoreCase("f")) && (idade < 25)) { 
      JOptionPane.showMessageDialog(null, nome + " Aceita.");       

      } else {
      JOptionPane.showMessageDialog(null, nome + " Não Aceita.");
     } 
   }            
}  


