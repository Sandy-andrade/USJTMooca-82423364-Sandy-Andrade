import javax.swing.JOptionPane;
public class SolucaoAula3_16
{
    public static void main(String[] args) 
    {
    
        String snumeros = JOptionPane.showInputDialog
        ("Digite um número:");
        
        int numeroUsuario = Integer.parseInt(snumeros);
        int contador = 1;
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int resuldoSoma = 0;
        
        while (contador < numeroUsuario) {
             resuldoSoma = primeiroNumero + segundoNumero;
            
            primeiroNumero = segundoNumero;
            segundoNumero = resuldoSoma;
            contador = contador +1;

        }   

        JOptionPane.showMessageDialog(null, resuldoSoma);
   }  
}
        
