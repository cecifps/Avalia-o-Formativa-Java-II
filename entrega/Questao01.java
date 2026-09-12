import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        String curso;

        System.out.print("Nome: ");
        nome = scanner.nextLine();

        System.out.print("Idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Curso: ");
        curso = scanner.nextLine();

        System.out.println();
        System.out.println("Dados do estudante");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);

        scanner.close();
    }
}
