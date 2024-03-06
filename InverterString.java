import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);

        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            // Troca os caracteres na posição inicio e fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Avança o início e retrocede o fim
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}