import javax.swing.JOptionPane;
public class RaizQuadrada
{
  public static void main(String[] args)
  {
        
     String numeroString = JOptionPane.showInputDialog(
      "Digite o numero:");
                   
       //pegando as informacoes da data
    double numero = Double.parseDouble(numeroString);
    double quadrado = Math.pow(numero, 2); 
    double raizQuadrada = Math.sqrt(numero);
   
      
    String resultado = String.format("O numero é %s, o quadrado é %s, a raiz quadrada é %s", numero, quadrado, raizQuadrada);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       