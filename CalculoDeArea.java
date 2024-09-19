import javax.swing.JOptionPane;
public class CalculoDeArea
{
  public static void main(String[] args)
  {
    
    
     String raioString = JOptionPane.showInputDialog(
      "Digite o raio do Circulo:");

                        
       //pegando as informacoes da data
    double raio = Double.parseDouble(raioString);
    double pi = 3.14159; 
    
    //calculo da area
    double area = pi * raio * raio;
    
    String resultado = String.format("A Area do circulo é %s", area);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       