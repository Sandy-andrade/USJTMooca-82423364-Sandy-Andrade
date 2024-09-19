import javax.swing.JOptionPane;
public class Triangulo
{
  public static void main(String[] args)
  {
        
     String baseString = JOptionPane.showInputDialog(
      "Digite a Base do Triangulo:");
      String alturaString = JOptionPane.showInputDialog(
      "Digite a Altura do Triangulo:");

                   
       //pegando as informacoes da data
    double base = Double.parseDouble(baseString);
    double altura = Double.parseDouble(alturaString); 
    
    
    double area = 1.0 / 2.0 * base * altura;

         
    String resultado = String.format("A area é %s", area);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       