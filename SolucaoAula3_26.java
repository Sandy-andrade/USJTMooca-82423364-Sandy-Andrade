import javax.swing.JOptionPane;
public class SolucaoAula3_26
{
    public static void main(String[] args) 
    {
       
       
       double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        int opcao;

        do {
            // Apresenta o menu
            String menu = "Operações Disponíveis:\n" +
                          "1. Adição\n" +
                          "2. Subtração\n" +
                          "3. Multiplicação\n" +
                          "4. Divisão\n" +
                          "9. Sair do Programa";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            double resultado = 0;
            String mensagem = "";

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    mensagem = "Resultado da Adição: " + resultado;
                    break;
                case 2:
                    resultado = num1 - num2;
                    mensagem = "Resultado da Subtração: " + resultado;
                    break;
                case 3:
                    resultado = num1 * num2;
                    mensagem = "Resultado da Multiplicação: " + resultado;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        mensagem = "Resultado da Divisão: " + resultado;
                    } else {
                        mensagem = "Erro: Divisão por zero não é permitida.";
                    }
                    break;
                case 9:
                    mensagem = "Saindo do programa...";
                    break;
                default:
                    mensagem = "Opção inválida. Tente novamente.";
            }

            if (opcao != 9) {
                JOptionPane.showMessageDialog(null, mensagem);
            }

        } while (opcao != 9);
    }
}