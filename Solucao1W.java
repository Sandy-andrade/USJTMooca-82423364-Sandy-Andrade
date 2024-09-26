import javax.swing.JOptionPane;
public class Solucao1W
{
    public static void main(String[] args)
     {
        // Entrada dos números
        String numero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String numero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String numero3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        // Convertendo para inteiro
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int num3 = Integer.parseInt(numero3);

        int maior, intermediario, menor;

        // Determinação dos números
        if (num1 > num2 && num1 > num3) 
        {
            maior = num1;
        if (num2 > num3) 
        {
           intermediario = num2;
             menor = num3;
        } 
           
        else
       {
         intermediario = num3;
            menor = num2;
       }
     } 
       else if (num2 > num1 && num2 > num3) 
     {
            maior = num2;
       if (num1 > num3) 
     {
         intermediario = num1;
              menor = num3;
     } 
       else 
     {
        intermediario = num3;
                menor = num1;
       }
     } 
        else 
     {
        maior = num3;
        if (num1 > num2) 
     {
         intermediario = num1;
                menor = num2;
      } 
      else 
      {
          intermediario = num2;
                  menor = num1;
       }
      }

        // Apresentação do resultado
        String resultado = "Maior: " + maior + "\n" +
                           "Intermediário: " + intermediario + "\n" +
                           "Menor: " + menor;
        JOptionPane.showMessageDialog(null, resultado);
    }
}


