import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada do usuário
        String url = scanner.nextLine();

        // TODO: Normalize a URL: removendo espaços e convertendo para minúsculas
        String urlNormalizada = url.trim().toLowerCase();

        // TODO: Exiba a URL normalizada
        System.out.println( urlNormalizada);

        scanner.close();
    }
}
