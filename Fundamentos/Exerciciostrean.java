import java.util.Arrays;
import java.util.List;

public class Exerciciostrean {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 10, 7, 8, 15, 20, 4, 9);

        var verificar = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .toList();

        System.out.println(numeros);
        System.out.println(verificar);

    }

}
/*
 * 
 * 🟢Exercício 1—
 * 
 * Números pares
 * 
 * Dada uma
 * lista de
 * números inteiros:
 * 
 * List<Integer> numeros = Arrays.asList(3, 10, 7, 8, 15, 20, 4, 9);
 * 
 * Use Stream+
 * Lambda para:
 * 
 * Filtrar apenas
 * os números
 * pares.
 * 
 * Multiplicar cada
 * número par por 2.
 * 
 * Retornar o
 * resultado em
 * uma List<Integer>.
 * 
 * Resultado esperado:
 * 
 * [20,16,40,8
 * ]
 * 
 */