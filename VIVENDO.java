import javax.swing.JOptionPane;
public class VIVENDO
{
  public static void main(String[] args)
  {
    //lendo os dados
    String sDiaNasc = JOptionPane.showInputDialog(
       "Digite o dia que nasceu:");
    String sMesNasc = JOptionPane.showInputDialog(
       "Digite o mes que nasceu:");
    String sAnoNasc = JOptionPane.showInputDialog( 
      "Digite o ano que nesceu:");
    String sDiaAtual = JOptionPane.showInputDialog( 
      "Digite o dia atual:");
    String sMesAtual = JOptionPane.showInputDialog( 
      "Digite o mes atual:");
    String sAnoAtual = JOptionPane.showInputDialog(
     "Digite o ano atual:");
       
    //convertendo para reais
    double diaNasc = Double.parseDouble(sDiaNasc);
    double mesNasc = Double.parseDouble(sMesNasc);
    double anoNasc = Double.parseDouble(sAnoNasc);
    double diaAtual = Double.parseDouble(sDiaAtual);
    double mesAtual = Double.parseDouble(sMesAtual);
    double anoAtual = Double.parseDouble(sAnoAtual);
    
    //calculando o vivendo
    //double vivendo = dia / (ano * ano);
    double dia = diaAtual - diaNasc ;
    double  mes = mesAtual - mesNasc ;
    double  ano = anoAtual - anoNasc ;
    
    double  QTDDIAS = 0.0;
    QTDDIAS = ano * 360;
    
    
    if (mes<0.0){
             QTDDIAS += mes *(-1)*30; 
              }
              else {
              QTDDIAS += mes * 30;
              }
              
              if (dia<0.0){
             QTDDIAS += dia *(-1); 
              }
              else {
              QTDDIAS += dia;
              }
    
      //apresentando o resultado
    JOptionPane.showMessageDialog(null, "QTDDIAS = " + QTDDIAS);
            
  }
}          