import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try {

            double divisao = (double) num1 / num2;
            System.out.println("O resultado da divisão é: " + divisao);

        } catch (ArithmeticException e ){
            System.out.println("Erro: Não é possível dividir um número por zero!");
        }
    }
}