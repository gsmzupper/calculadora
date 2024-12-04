# Calculadora

Bem-vindo ao repositório da **Calculadora**! Este projeto foi desenvolvido como parte de um desafio do programa **Catalisa** e implementa uma calculadora simples em Java que realiza as quatro operações matemáticas básicas: adição, subtração, multiplicação e divisão. A aplicação interage diretamente com o usuário por meio do console.

## Funcionalidades

- Realiza as operações matemáticas básicas:
  - **Adição** (`+`)
  - **Subtração** (`-`)
  - **Multiplicação** (`*`)
  - **Divisão** (`/`)
- Valida a operação de divisão para evitar divisões por zero.
- Interação amigável com o usuário via entrada de dados no console.

## Como usar

1. Clone este repositório:
   ```bash
   git clone https://github.com/gsmzupper/calculadora.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd calculadora
   ```
3. Compile o código:
   ```bash
   javac Calculadora.java
   ```
4. Execute o programa:
   ```bash
   java Calculadora
   ```

5. Siga as instruções no console:
   - Insira o primeiro número.
   - Insira o segundo número.
   - Escolha a operação desejada (`+`, `-`, `*`, `/`).

## Exemplo de Uso

Ao executar o programa, você verá algo como:

```
	Bem-vindo a nossa calculadora! 
	Digite o primeiro número para realizar a operação: 
10

	Digite o segundo valor que deseja usar na operação: 
5

	Digite qual é a operação que deseja realizar: 
+

	O resultado da operação é: 15.00
```

Se você tentar realizar uma divisão por zero, o programa exibirá a seguinte mensagem:

```
	A operação de divisão por (0) não é permitida.
```

## Código Principal

Aqui está o código principal da calculadora:

```java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBem-vindo a nossa calculadora! \n"
        +"\tDigite o primeiro número para realizar a operação: ");
        double valor1 = sc.nextDouble();
        System.out.println("\n\tDigite o segundo valor que deseja usar na operação: ");
        double valor2 = sc.nextDouble();
        System.out.println("\tDigite qual é a operação que deseja realizar: ");
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
                System.out.println("\tA operação de divisão por (0) não é permitida.");
            } else {
                resultado = valor1 / valor2;
                System.out.printf("\tO resultado da operação é: %.2f ", resultado);
            }
        }
        sc.close();
    }
}
```

## Melhorias Futuras

- Adicionar suporte a operações mais avançadas, como potência e raiz quadrada.
- Implementar uma interface gráfica para melhorar a experiência do usuário.
- Adicionar testes automatizados para garantir a qualidade do código.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para contribuir.