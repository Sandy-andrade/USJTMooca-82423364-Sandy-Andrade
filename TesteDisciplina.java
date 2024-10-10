import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
    
        // Leitura dos dados da disciplina
        String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre:"));
        boolean ofertada = Boolean.parseBoolean(JOptionPane.showInputDialog("A disciplina é ofertada? (true/false):"));

        // Criação da disciplina
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        // Exibição da disciplina criada
        JOptionPane.showMessageDialog(null, "Disciplina criada:\n" + 
                "Nome: " + disciplina.getNome() + 
                "\nProfessor: " + disciplina.getProfessor() + 
                "\nSemestre: " + disciplina.getSemestre() + 
                "\nOfertada: " + disciplina.getOfertada());

        // Solicita nova informação sobre a oferta da disciplina
        boolean novaOfertada = Boolean.parseBoolean(JOptionPane.showInputDialog("A disciplina é ofertada agora? (true/false):"));
        disciplina.setOfertada(novaOfertada);

        // Exibição dos dados da disciplina após a alteração
        JOptionPane.showMessageDialog(null, "Dados atualizados da disciplina:\n" + 
                "Nome: " + disciplina.getNome() + 
                "\nProfessor: " + disciplina.getProfessor() + 
                "\nSemestre: " + disciplina.getSemestre() + 
                "\nOfertada: " + disciplina.getOfertada());
    }
}