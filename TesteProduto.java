import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
    
        // Leitura dos dados do produto
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));

        // Criação do produto
        Produto produto = new Produto(nome, preco, quantidade);

        // Exibição do produto criado
        JOptionPane.showMessageDialog(null, "Produto criado:\n" + 
                "Nome: " + produto.getNome() + 
                "\nPreço: " + produto.getPreco() + 
                "\nQuantidade: " + produto.getQuantidade());

        // Solicita nova quantidade do produto
        int novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade do produto:"));
        produto.setQuantidades(novaQuantidade);

        // Exibição dos dados do produto após a alteração
        JOptionPane.showMessageDialog(null, "Dados atualizados do produto:\n" + 
                "Nome: " + produto.getNome() + 
                "\nPreço: " + produto.getPreco() + 
                "\nQuantidade: " + produto.getQuantidade());
    }
}