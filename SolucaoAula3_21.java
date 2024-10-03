import javax.swing.JOptionPane;
public class SolucaoAula3_21
{
    public static void main(String[] args) 
    {
    
        int totalPessoas = 20;
        
        //loop pra coletar dados de 20 pessoas
        for (int i = 0; i < totalPessoas; i++) {
        
        //entrada de dados
        String sNome = JOptionPane.showInputDialog
        ("Digite o nome " +(i + 1) + ":");
        String sIdade = JOptionPane.showInputDialog
        ("Digite a idade " + sNome + ":");
        String sSexo = JOptionPane.showInputDialog
        ("Digite o sexo " + sNome + " (M/F):").toUpperCase();
        
        int idade = Integer.parseInt(sIdade);

        //verificando condiçoes e imprimindo o nome
        if (sSexo.equals("M") && idade > 21) {
            JOptionPane.showMessageDialog(null, "Nome: " + sNome);
        }
      }  
   }  
}
        
