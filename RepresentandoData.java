import javax.swing.JOptionPane;
public class RepresentandoData
{
  public static void main(String[] args)
  {
    
      String diaString = JOptionPane.showInputDialog(
      "Digite o dia:");
      String mesString = JOptionPane.showInputDialog(
       "Digite o mes:");
      String anoString = JOptionPane.showInputDialog(
      "Digite o ano:");
            
       //convertendo a String para int
    int dia = Integer.parseInt(diaString);
    int mes = Integer.parseInt(mesString);   
    int ano = Integer.parseInt(anoString);

    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "A Data é: " + dia + "/" + mes + "/" + ano); 
  }
}       