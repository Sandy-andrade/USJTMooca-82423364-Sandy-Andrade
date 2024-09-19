import javax.swing.JOptionPane;
public class LogaritimoBase
{
  public static void main(String[] args)
  {
    
    String numeroString = JOptionPane.showInputDialog(
      "Digite um numero:");
    String baseString = JOptionPane.showInputDialog(
      "Digite a base:");

      
      //convertendo String para Double
    double numero = Double.parseDouble(numeroString);
    double base = Double.parseDouble(baseString);


                    
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "O LOGARITIMO DESSE NUMERO COM ESSA BASE É = " +  Math.log10(numero)/Math.log10(base) );



  }
}       