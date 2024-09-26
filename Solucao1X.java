import javax.swing.JOptionPane;
public class Solucao1X
{
    public static void main(String[] args) 
    {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) 
        {
            String snumeros = JOptionPane.showInputDialog("Digite o " + i + "º número:");
            int numero = Integer.parseInt(snumeros);

            // Verificar se é o maior
            if (numero > maior) 
            {
                maior = numero;
            }
            // Verificar se é o menor
            if (numero < menor) 
            {
                menor = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}