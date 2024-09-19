import javax.swing.JOptionPane;
public class CasasDecimais
{
  public static void main(String[] args)
  {
    
    String nuneroInteiroString = JOptionPane.showInputDialog(
      "Digite um nunmero inteiro com tres algarismos:");
            
       //pegando a casa das desenas 
    String casaDezena = nuneroInteiroString.substring( nuneroInteiroString.length()-2, nuneroInteiroString.length()-1 );
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "O NUMERO DA CASA DAS DEZENAS É = " + casaDezena); 
  }
}       