import java.util.Collections;

import java.util.ArrayList;

public class ListadeCompras {

    public static void main(String[] args) {

        ArrayList<String> listadecompras = new ArrayList<>();

        listadecompras.add("Banana");
        listadecompras.add("Beteraba");
        listadecompras.add("Leite");
        listadecompras.add("Ovos");
        listadecompras.add("Manteiga");
        listadecompras.add("Carne Vermelha");
        listadecompras.add("Sabonete");
        listadecompras.add("Bucha");

        Collections.sort(listadecompras);

        System.out.println("Lista Inical : " + listadecompras );

        if(listadecompras.contains("Leite")){
            System.out.println("Item presente na lista ");
        }

        System.out.println("Lista Atualizada " + listadecompras);





    }


}
/*Lista de compras: cadastre itens, 
remova um item pelo nome,
 verifique se “Leite” está na lista 
 e mostre a lista final em ordem alfabética.
 */