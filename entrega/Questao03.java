import java.util.Scanner;

public class Questao03 {

    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    public static boolean contemSilva(String nome) {
        return nome.contains("Silva");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.print("Nome completo: ");
        nome = scanner.nextLine();

        int quantidade = quantidadeCaracteres(nome);
        String nomeMaiusculo = formatarNome(nome);
        boolean possuiSilva = contemSilva(nome);

        System.out.println();
        System.out.println("Quantidade de caracteres: " + quantidade);
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
        System.out.println("Contém \"Silva\": " + possuiSilva);

        scanner.close();
    }
}
