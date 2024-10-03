import javax.swing.JOptionPane;
public class SolucaoAula3_17
{
    public static void main(String[] args) 
    {
    
        String spolegadas = JOptionPane.showInputDialog
        ("Digite um valor em Polegadas:");
        
        double polegadas = Double.parseDouble(spolegadas);
        
        double centimetros = polegadas * 2.54;

        JOptionPane.showMessageDialog(null, polegadas + "polegadas é igual a " + centimetros + "centimetros.", "Resultado da Conversão", JOptionPane.INFORMATION_MESSAGE);
   }  
}
        
