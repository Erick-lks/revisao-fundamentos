import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InicializarArray {

    public static void main(String[] args) {

        // ==========================
        // ARRAY
        // ==========================

        // Array possui tamanho fixo
        String[] frutas = {"Banana", "Maçã", "Tomate"};

        // Imprime o array completo
        System.out.println("Array: " + Arrays.toString(frutas));

        // Imprime os elementos separados por vírgula
        System.out.println("Array formatado: " + String.join(", ", frutas));

        // Percorre o array
        System.out.println("\nPercorrendo Array:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // ==========================
        // ARRAYLIST
        // ==========================

        ArrayList<String> frutasArrayList = new ArrayList<>();

        // Adiciona elementos ao final da lista
        frutasArrayList.add("Banana");
        frutasArrayList.add("Maçã");
        frutasArrayList.add("Tomate");

        // Adiciona um elemento em uma posição específica
        frutasArrayList.add(1, "Pêra");

        // Retorna o elemento da posição informada
        System.out.println("\nPrimeira fruta: " + frutasArrayList.get(0));

        // Altera o valor de uma posição
        frutasArrayList.set(0, "Abacaxi");

        // Remove um elemento pelo valor
        frutasArrayList.remove("Tomate");

        // Adiciona mais elementos
        frutasArrayList.add("Maracujá");
        frutasArrayList.add("Laranja");

        // Remove um elemento pelo índice
        frutasArrayList.remove(1);

        // Verifica se um elemento existe
        System.out.println("Contém Laranja? " + frutasArrayList.contains("Laranja"));

        // Retorna o índice de um elemento
        System.out.println("Posição da Laranja: " + frutasArrayList.indexOf("Laranja"));

        // Retorna a quantidade de elementos
        System.out.println("Quantidade: " + frutasArrayList.size());

        // Verifica se está vazia
        System.out.println("Está vazia? " + frutasArrayList.isEmpty());

        // Ordena alfabeticamente
        Collections.sort(frutasArrayList);

        // Percorre a lista
        System.out.println("\nArrayList Ordenada:");
        for (String fruta : frutasArrayList) {
            System.out.println(fruta);
        }

        // Remove todos os elementos
        frutasArrayList.clear();

        // Verifica novamente se está vazia
        System.out.println("\nApós clear(): " + frutasArrayList.isEmpty());
    }
}

/*Use ArrayList quando:
Precisar acessar elementos por índice frequentemente.
Tiver mais leituras do que alterações.
Na maioria dos projetos */

