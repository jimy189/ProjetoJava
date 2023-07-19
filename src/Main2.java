import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

        System.out.println("NOTAS:");
        for (double nota : notas) {
            int quantidade = (int) (valor / nota);
            valor %= nota;
            System.out.println(quantidade + " nota(s) de " + String.format("%.2f", nota));
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidade = (int) (valor / moeda);
            valor %= moeda;
            System.out.println(quantidade + " moeda(s) de " + String.format("%.2f", moeda));
        }
    }
}




