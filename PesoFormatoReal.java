import javax.swing.JOptionPane;
public class PesoFormatoReal
{
  public static void main(String[] args)
  {
    
      String pesoString = JOptionPane.showInputDialog(
      "Digite o seu Peso em Kg:");
 
       //convertendo a String para double
    double peso = Double.parseDouble(pesoString);
    
    String resultado = ("O peso é" + peso + " kg. ");

    //apresentando o resultado
    JOptionPane.showMessageDialog(null, resultado); 
  }
}  