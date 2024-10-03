import javax.swing.JOptionPane;
public class SolucaoAula3_22
{
    public static void main(String[] args) 
    {
    
        String numero = JOptionPane.showInputDialog
        ("Digite um número como limite superior:");
        
        //convertendo string
        int limite = Integer.parseInt(numero);
        
        StringBuilder resultado = new StringBuilder("Números ímpares:");
        
        //loop para encontrar e armazenar os números
        for (int i = 1; i < limite; i += 2) {
             resultado.append(i).append(", ");
        }
        
        //removendo ultima virgula e espaço
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 2);
        }
           
        JOptionPane.showMessageDialog(null, resultado.toString());
   }  
}
        
