import javax.swing.JOptionPane;

public class TesteAtribuicao1D {
    public static void main(String[] args) {      
        
    String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do Professor:");
    String idadeS = JOptionPane.showInputDialog("Digite a idade do Professor:");  
    int idade = Integer.parseInt(idadeS);  
    
    //obj Professor
    Professor professor = new Professor(nomeProfessor,idade);
    
    // entrada de Dados para Disciplina
    String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina:");
    String praticaS = JOptionPane.showInputDialog("A Disciplina é Prática? (sim/não)");  
    boolean pratica = praticaS.equalsIgnoreCase("sim");
    
    //obj Disciplina
    Disciplina disciplina = new Disciplina(nomeDisciplina,pratica);
    
    //Criando Atribuição
    Atribuicao atribuicao = new Atribuicao(professor, disciplina);
    
    JOptionPane.showMessageDialog(null, atribuicao.getDados());
  }      
}