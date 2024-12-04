import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBem-vindo a nossa calculadora! \n"
        +"\tDigite o primeiro número para realisar a operação: ");
        double valor1 = sc.nextDouble();
        System.out.println("\n\tDigite o segundo valor que deseja usar na operação: ");
        double valor2 = sc.nextDouble();
        System.out.println("\tDigite qual é a operação que deseja realisar: ");
    String operacao = sc.next();

        double resultado;
        if (operacao.equalsIgnoreCase("-")) {
            resultado = valor1 - valor2;
            System.out.printf("\tO resultado é: %.2f ", resultado);
        } else if (operacao.equalsIgnoreCase("+")) {
            resultado = valor1 + valor2;
            System.out.printf("\tO resultado da operação é: %.2f ", resultado);
        } else if (operacao.equalsIgnoreCase("*")) {
            resultado = valor1 * valor2;
            System.out.printf("\tO resultado da operação é: %.2f", resultado);
        } else {
            if (valor2 == 0.0) {
                System.out.println("\tA operação de divizão por (0) não é permitida.");
            } else {
                resultado = valor1 / valor2;
                System.out.printf("\tO resultado da operação é: %.2f ", resultado);
            }
        }
        sc.close();
    }
}
