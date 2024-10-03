import javax.swing.JOptionPane;
public class SolucaoAula3_25
{
    public static void main(String[] args) 
    {
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int totalEleitores = 0;
        
        while (true) {
           String entrada = JOptionPane.showInputDialog("Digite o número do candidato (1 a 4) ou -1 para encerrar:");
           int voto;
       
       try {
           voto = Integer.parseInt(entrada);
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.");
           continue;
       }
       
       if (voto == -1) {
           break;
       }
       
       switch (voto) {
           case 1:
              votosCandidato1++;
              totalEleitores++;
              break;
           case 2:
              votosCandidato2++;
              totalEleitores++;
               break;
           case 3:
              votosCandidato3++;
              totalEleitores++;
               break;
           case 4:
              votosCandidato4++;
              totalEleitores++;
               break;
           default:     
              JOptionPane.showMessageDialog(null, "Voto inválido! Tente novamente.");
          }
       }       
       
       String resultado = "Total de alunos eleitores: " + totalEleitores + "\n";
       if (totalEleitores > 0) {
           double percentualCandidato1 = (votosCandidato1 / (double) totalEleitores) * 100;
           double percentualCandidato2 = (votosCandidato2 / (double) totalEleitores) * 100;
           double percentualCandidato3 = (votosCandidato3 / (double) totalEleitores) * 100;
           double percentualCandidato4 = (votosCandidato4 / (double) totalEleitores) * 100;
           
           resultado += "Percentual de votos do candidato 1: " + percentualCandidato1 + "%\n";
           resultado += "Percentual de votos do candidato 2: " + percentualCandidato2 + "%\n";
           resultado += "Percentual de votos do candidato 3: " + percentualCandidato3 + "%\n";
           resultado += "Percentual de votos do candidato 4: " + percentualCandidato4 + "%\n";
        } else {
           resultado += "Nenhum voto foi registrado.";
        }
                     
        JOptionPane.showMessageDialog(null, resultado);
   }  
}
        
