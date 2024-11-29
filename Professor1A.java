public class Professor1A {
    //atributos
    private String nome;
    private int idade;

    // metodo construtor
    public Professor(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }

    // método de acesso
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    //método modificadores
    public void setNome(String nome) {
        this.nome = nome;      
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //método getDados- para obter os Dados do Professor
    public String getDados(){
      return "Professor[nome=" + nome + ",idade=" + idade +"]";
    }
}