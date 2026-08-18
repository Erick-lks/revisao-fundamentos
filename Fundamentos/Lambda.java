
import java.util.ArrayList;

public class Lambda {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Erick");
        nomes.add("Joao");
        nomes.add("Joana");
        nomes.add("Julia");
        nomes.add("Jackson");

        nomes.forEach(nome -> System.out.println(nome));

    }

}
