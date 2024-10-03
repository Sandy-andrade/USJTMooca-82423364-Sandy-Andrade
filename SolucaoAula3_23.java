import javax.swing.JOptionPane;
public class SolucaoAula3_23
{
    public static void main(String[] args) 
    {
    
        String numeros = JOptionPane.showInputDialog
        ("Digite quantos números pares você deseja imprimir:");
        
        //convertendo string
        int quantidade = Integer.parseInt(numeros);
        
        StringBuilder resultado = new StringBuilder("Números pares:");
        
        //loop para encontrar e armazenar os números
        for (int i = 1; i <= quantidade; i++) {
             resultado.append(i * 2).append(", "); //multiplicando por 2 para obter numero par 
        }
        
        //removendo ultima virgula e espaço
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 2);
        }
           
        JOptionPane.showMessageDialog(null, resultado.toString());
   }  
}
        
