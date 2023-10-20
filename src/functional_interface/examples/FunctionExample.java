package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros usando Arrays.asList() e inicializa-a com os valores 1, 2, 3, 4 e 5.
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5);

        // Define uma função que recebe um inteiro (Integer) como entrada e retorna um inteiro como saída.
        // Neste caso, a função "dobrar" multiplica o número de entrada por 2.
        Function<Integer, Integer> dobrar = numeros -> numeros * 2;

        // Aplica a função "dobrar" a cada elemento da lista "numero" usando a operação de mapeamento (map)
        // e coleta os resultados em uma nova lista chamada "numeroDobrados".
        List<Integer> numeroDobrados = numero.stream()
                .map(dobrar)
                .toList(); // Coleta os elementos mapeados em uma lista.

        // Itera sobre a lista "numeroDobrados" e imprime cada elemento na saída padrão.
        numeroDobrados.forEach(System.out::println);
    }
}
