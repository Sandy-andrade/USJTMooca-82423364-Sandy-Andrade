import javax.swing.JOptionPane;
public class ExibirData
{
  public static void main(String[] args)
  {
    
    String dataString = JOptionPane.showInputDialog(
      "Digite a data - Formato ddmmaa:");
            
            
       //pegando as informacoes da data
    String dia = dataString.substring( 0, 2 );
    String mes = dataString.substring( 2, 4 );
    String ano = dataString.substring( 4, 6 );


    
    String resultado = String.format("O dia é %s, o mes é %s, o ano é %s", dia, mes, ano);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       