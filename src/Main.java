import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorInput = scanner.nextInt();

        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < valorInput; i++) {
            valores.add(scanner.nextInt());
        }
        List<Integer> valoresOrdenados = ordenarValores(valores);

        for (Integer valor : valoresOrdenados) {
            System.out.println(valor);
        }

    }

    public static List<Integer> ordenarValores(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        // Separar pares e ímpares
        for (Integer valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        // Ordenar pares em ordem crescente
        Collections.sort(pares);

        // Ordenar ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        // Combinar pares e ímpares em uma única lista
        List<Integer> valoresOrdenados = new ArrayList<>();
        valoresOrdenados.addAll(pares);
        valoresOrdenados.addAll(impares);

        return valoresOrdenados;
    }
}
