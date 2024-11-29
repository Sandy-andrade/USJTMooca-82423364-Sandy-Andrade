public class Atribuicao1C {
    //atributos
    private Professor professor;
    private Disciplina disciplina;
    private int semestre;
    private boolean ofertada;

    // metodo construtor
    public Atribuicao(Professor professor, Disciplina disciplina) {
      this.professor = professor;
      this.disciplina = disciplina;
    }

    // método de acesso
    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    //método modificadores
    public void setProfessor(Professor professor) {
        this.professor = professor;      
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    //método getDados- para obter os Dados da Atribuicao
    public String getDados(){
    return "Atribuicao[Professor: " + professor.getDados() + "\nDisciplina: " + disciplina.getDados();
    }
}
