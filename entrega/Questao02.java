import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade;
        double nota;
        double soma = 0;
        double maior = 0;
        double menor = 10;
        int aprovados = 0;

        System.out.print("Quantidade de estudantes: ");
        quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            System.out.print("Nota do estudante " + i + ": ");
            nota = scanner.nextDouble();

            soma = soma + nota;

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / quantidade;

        System.out.println();
        System.out.println("Resultado");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Estudantes aprovados: " + aprovados);

        scanner.close();
    }
}
