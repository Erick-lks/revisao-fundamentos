
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava {

        public static void main(String[] args) {

                ArrayList<String> listadeCompras = new ArrayList<>();

                listadeCompras.add("Leite");
                listadeCompras.add("Laranja");
                listadeCompras.add("Coca Cola");

                listadeCompras.stream()
                                .filter(compra -> compra.startsWith("L"))
                                .map(String::toUpperCase)
                                .forEach(System.out::println);

                // Colection

                var listamodificada = listadeCompras.stream()
                                .filter(compra -> compra.startsWith("L"))
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());

                System.out.println(listamodificada);

                // Reduce

                var numeros = List.of(10, 2, 5, 8, 5, 9);

                var soma = numeros.stream()
                                .reduce(0, Integer::sum);

                var minimo = numeros.stream()
                                .reduce(1, Integer::min);

                System.out.println(soma);
                System.out.println(minimo);
        }

}
