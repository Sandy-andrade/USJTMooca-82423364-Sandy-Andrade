import javax.swing.JOptionPane;
public class CalculaExpressao
{
  public static void main(String[] args)
  {
    
    
     String variavelAString = JOptionPane.showInputDialog(
      "Digite a Variavel A:");
     String variavelBString = JOptionPane.showInputDialog(
      "Digite a Variavel B:");
     String variavelCString = JOptionPane.showInputDialog(
      "Digite a Variavel C:");

                        
       //pegando as informacoes da data
    double varA = Double.parseDouble(variavelAString); 
    double varB = Double.parseDouble(variavelBString);
    double varC = Double.parseDouble(variavelCString);
    
    double x = 2 * ( ( varA - varC ) / 8 ) - varB * 5;
    
    String resultado = String.format("O resultado da expressao é %s", x);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       