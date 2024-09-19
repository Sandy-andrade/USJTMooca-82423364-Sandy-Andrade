import javax.swing.JOptionPane;
public class ExibirDataComBarra
{
  public static void main(String[] args)
  {
    
    String dataString = JOptionPane.showInputDialog(
      "Digite a data - Formato dd/mm/aa:");
            
            
       //pegando as informacoes da data
    String dia = dataString.substring( 0, 2 );
    String mes = dataString.substring( 3, 5 );
    String ano = dataString.substring( 6, 8 );


    
    String resultado = String.format("O dia é %s, o mes é %s, o ano é %s", dia, mes, ano);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       