import javax.swing.JOptionPane;
public class Divisao
{
  public static void main(String[] args)
  {
        
     String dividendoString = JOptionPane.showInputDialog(
      "Digite o Dividendo da Divisao:");

                     
       //pegando as informacoes da data
    double dividendo = Double.parseDouble(dividendoString);
    double divisor = Double.parseDouble(divisorString);
    

   //Convertendo Quociente para int
   int quociente = (int) Math.floor(dividendo / divisor); 
   
   int resto = (int) Math.floor( dividendo - quociente * divisor); 
    
    String resultado = String.format("O dividendo é %s, o divisor é %s, o quociente é %s, o resto é %s", dividendo, divisor, quociente, resto);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "Resultado = " + resultado); 
  }
}       