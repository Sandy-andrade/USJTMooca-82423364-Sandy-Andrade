import javax.swing.JOptionPane;
public class Logaritimo
{
  public static void main(String[] args)
  {
    
    String numeroString = JOptionPane.showInputDialog(
      "Digite um numero:");
      
      //convertendo String para Double
    double numero = Double.parseDouble(numeroString);

                    
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "O LOGARITIMO DESSE NUMERO É = " +  Math.log10(numero) );



  }
}       