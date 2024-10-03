import javax.swing.JOptionPane;
public class SolucaoAula3_18
{
    public static void main(String[] args) 
    {
    
        String grausCelsius = JOptionPane.showInputDialog
        ("Digite a Temperatura em graus Celsius:");
        
        
        double celsius = Double.parseDouble(grausCelsius);
        
        //calculando a conversão
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        

        JOptionPane.showMessageDialog(null, celsius + "graus celsius é igual a " + fahrenheit + "graus fahrenheit.", "Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE);
   }  
}
        
