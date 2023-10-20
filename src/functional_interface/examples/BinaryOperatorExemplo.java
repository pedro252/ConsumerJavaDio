package functional_interface.examples;  // Define o pacote onde a classe BinaryOperatorExemplo está localizada.

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {  // Define a classe BinaryOperatorExemplo.

    public static void main(String[] args) {  // Define o método main, que é o ponto de entrada do programa.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);  // Cria uma lista de números inteiros.

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;  // Cria uma variável chamada "somar" do tipo BinaryOperator<Integer> e atribui a ela uma expressão lambda que soma dois números inteiros.

        int resultado = numeros.stream()  // Cria um fluxo (stream) a partir da lista "numeros".
                .reduce(0, Integer::sum);  // Realiza uma operação de redução no fluxo, somando todos os elementos a partir de um valor inicial de 0. O método "Integer::sum" é uma referência a um método estático da classe Integer que realiza a soma.

        System.out.println(resultado);  // Imprime o resultado no console.

    }
}
