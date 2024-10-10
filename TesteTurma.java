import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
        // Leitura dos dados da turma
        String nome = JOptionPane.showInputDialog("Digite o nome da turma:");
        String curso = JOptionPane.showInputDialog("Digite o nome do curso:");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série da turma:"));

        // Criação da turma
        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        // Exibição da turma criada
        JOptionPane.showMessageDialog(null, "Turma criada:\n" + 
                "Nome: " + turma.getNome() + 
                "\nCurso: " + turma.getCurso() + 
                "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + 
                "\nSérie: " + turma.getSerie());

        // Solicita nova quantidade de alunos
        int novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
        turma.setQuantidadeDeAlunos(novaQuantidade);

        // Exibição dos dados da turma após a alteração
        JOptionPane.showMessageDialog(null, "Dados atualizados da turma:\n" + 
                "Nome: " + turma.getNome() + 
                "\nCurso: " + turma.getCurso() + 
                "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + 
                "\nSérie: " + turma.getSerie());
    }
}