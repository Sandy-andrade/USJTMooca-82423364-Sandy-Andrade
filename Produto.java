public class Produto {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    // metodo construtor
    public Produto(String n, double p, int q) {
      nome = n;
      preco = p;
      quantidade = q;
    }

    // método de acesso
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //método modificadores
    public void setNome(String n) {
        nome = n;      
    }

    public void setPreco(double p) {
        preco = p;
    }

    public void setQuantidades(int q) {
        quantidade = q;
    }
}