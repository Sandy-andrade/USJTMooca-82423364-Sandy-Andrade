import javax.swing.JOptionPane;
public class Solucao1O
{
  public static void main(String[] args)
  {
    
      String anoNasc = JOptionPane.showInputDialog(
      "Digite o Ano de Nascimento:");
      
      String anoAtual = JOptionPane.showInputDialog(
      "Digite o Ano Atual:");
      
       //convertendo para inteiro
      int anoNascimento = Integer.parseInt(anoNasc);
      int anoAtuall = Integer.parseInt(anoAtual); 
      
      //verificando o ano de nascimento
      if (anoNascimento > anoAtuall || anoNascimento < 0) { 
      JOptionPane.showMessageDialog(null, "Ano de Nacimento inválido.");
      } else {
      
      //calculando idade
      int idade = anoAtuall - anoNascimento;
      JOptionPane.showMessageDialog(null, "A idade da é: " + idade + " anos.");
      }
   }            
}  


