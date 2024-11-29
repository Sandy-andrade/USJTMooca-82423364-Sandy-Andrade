public class Disciplina1B {
    // Atributos
    private String nome;
    private boolean pratica;
    
    //construtor
    public Disciplina(String nome, boolean pratica){
    this.nome = nome;
    this.pratica = pratica;
    }
    //metodo de acesso
    public String getNome(){
       return nome;
    }
    public boolean isPratica(){
       return pratica;
    }
    //metodo modificadores
    public void setNome(String nome){
       this.nome = nome;
    }
    public void setPratica(boolean pratica){
       this.pratica = pratica;
    }
    //método getDados- para obter os Dados da Disciplina
    public String getDados(){
    return "Nome: " + nome + "\npratica: " + (pratica ? "Sim" : "Nao");
    }
}
