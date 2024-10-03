import javax.swing.JOptionPane;
public class SolucaoAula3_20
{
    public static void main(String[] args) 
    {
    
        String sLimite = JOptionPane.showInputDialog
        ("Digite o limiite superior:");
        String sIncremento = JOptionPane.showInputDialog
        ("Digite o incremento:");
        
        int limiteSuperior = Integer.parseInt(sLimite);
        int incremento = Integer.parseInt(sIncremento);
        
        //contruindo a saída
        StringBuilder resultado = new StringBuilder("Número no intervalo:\n");
        
        
        for (int i = 0; i <= limiteSuperior; i += incremento) {
             //adicionando o numero ao resultado
             resultado.append(i).append(", ");    
        }   
        //removendo a ultima virgula e espaço
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 2);
        }    
 
        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultado",JOptionPane.INFORMATION_MESSAGE);
   }  
}
        
