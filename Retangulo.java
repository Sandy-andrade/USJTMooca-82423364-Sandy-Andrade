import javax.swing.JOptionPane;
public class Retangulo
{
  public static void main(String[] args)
  {
    //lendo dados
    String sBase = JOptionPane.showInputDialog(
      "Digite sua Base:");
    String sAltura = JOptionPane.showInputDialog(
      "Digite sua Altura:");
      
    //convertendo para reais
    double base = Double.parseDouble(sBase);
    double altura = Double.parseDouble(sAltura);
    
    //calculando o retangulo
    double retangulo = base * altura;
    
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "RETANGULO = " + retangulo); 
  }
}       