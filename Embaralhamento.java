import javax.swing.JOptionPane;
public class Embaralhamento
{
  public static void main(String[] args)
  {
    
    String primeiraFraseString = JOptionPane.showInputDialog(
      "Digite a primeira Frase:");
    String segundaFraseString = JOptionPane.showInputDialog(
      "Digite a segunda Frase:");
    String terceiraFraseString = JOptionPane.showInputDialog(
      "Digite a terceira Frase:");
      
      //obtendo o tamanho das frases 
    int tamanhoPrimeiraFrase = primeiraFraseString.length();
    int tamanhoSegundaFrase = segundaFraseString.length();
    int tamanhoTerceiraFrase = terceiraFraseString.length();
    
    // obtendo a posicao da metade da primeira frase
    int posicaoMetadePrimeiraFrase = tamanhoPrimeiraFrase / 2;
    
    // obtendo a primeira metade da primeira frase
    String primeiraMetadePrimeiraFrase = 
    primeiraFraseString.substring(0, posicaoMetadePrimeiraFrase);
    
    // obtendo a segunda metade da primeira frase
    String segundaMetadePrimeiraFrase = 
    primeiraFraseString.substring(posicaoMetadePrimeiraFrase, primeiraFraseString.length());
    
    // obtendo a posicao da metade da segunda frase
    int posicaoMetadeSegundaFrase = tamanhoSegundaFrase / 2;
    
    // obtendo a primeira metade da segunda frase
    String primeiraMetadeSegundaFrase = 
    segundaFraseString.substring(0, posicaoMetadeSegundaFrase);
    
    // obtendo a segunda metade da segunda frase
    String segundaMetadeSegundaFrase = 
    segundaFraseString.substring(posicaoMetadeSegundaFrase, segundaFraseString.length());
    
    // obtendo a posicao da metade da terceira frase
    int posicaoMetadeTerceiraFrase = tamanhoTerceiraFrase / 2;
    
    // obtendo a primeira metade da terceira frase
    String primeiraMetadeTerceiraFrase = 
    terceiraFraseString.substring(0, posicaoMetadeTerceiraFrase);
    
    // obtendo a segunda metade da terceira frase
    String segundaMetadeTerceiraFrase = 
    terceiraFraseString.substring(posicaoMetadeTerceiraFrase, terceiraFraseString.length());
    
    // concatenando todas as partes
    String resultado = primeiraMetadeSegundaFrase;
    resultado += segundaMetadeTerceiraFrase;
    resultado += segundaMetadeSegundaFrase;
    resultado += primeiraMetadePrimeiraFrase;
    resultado += primeiraMetadeTerceiraFrase;
    resultado += segundaMetadePrimeiraFrase;

                  
    //apresentando o resultado
    JOptionPane.showMessageDialog(null, "resultado = " +  resultado);

  }
}       