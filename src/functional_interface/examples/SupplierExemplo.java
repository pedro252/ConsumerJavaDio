package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {

    public static void main(String[] args) {


    Supplier<String> saudacoes = () -> "Ola, seja bem vindo";

    List<String> listaSaudacoes = Stream.generate(saudacoes)
            .limit(5)
            .toList();

    listaSaudacoes.forEach (System.out::println);
}
}
