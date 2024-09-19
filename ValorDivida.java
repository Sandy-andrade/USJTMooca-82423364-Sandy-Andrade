import javax.swing.JOptionPane;
public class ValorDivida
{
  public static void main(String[] args)
  {
    
    String valorInicialString = JOptionPane.showInputDialog(
      "Digite o valor inicial:");
    String taxaDeJurosString = JOptionPane.showInputDialog(
      "Digite a taxa De Juros:");
    String quantidadeDeMesesString = JOptionPane.showInputDialog(
      "Digite a quantidade De Meses:");
      
    //obtendo o tamanho da primeira string
    double valorInicial = Double.parseDouble(valorInicialString);
    double taxaDeJuros = Double.parseDouble(taxaDeJurosString);
    double quantidadeDeMeses = Double.parseDouble(quantidadeDeMesesString);
    
    //calculando o resultado
    double Valor_Final = valorInicial * Math.pow((1 + taxaDeJuros/100), quantidadeDeMeses);
        
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "SALDO DA DIVIDA = " + Valor_Final); 
  }
}       