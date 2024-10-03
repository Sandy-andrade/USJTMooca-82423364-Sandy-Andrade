import javax.swing.JOptionPane;
public class SolucaoAula3_19
{
    public static void main(String[] args) 
    {
    
        String sFatorial = JOptionPane.showInputDialog
        ("Digite um número para calcular o Fatorial:");
        
        //convertendo para inteiro
        int numero = Integer.parseInt(sFatorial);
        
        //calculando o fatorial
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
             //multiplica o fatorial pelo limite
             fatorial *= i; 
        }     
                
        JOptionPane.showMessageDialog(null, "o fatorial de " + numero + " é " + fatorial + ".", "Resultado do Fatorial", JOptionPane.INFORMATION_MESSAGE);
   }  
}
        
