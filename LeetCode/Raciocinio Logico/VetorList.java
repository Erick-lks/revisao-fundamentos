import java.util.ArrayList;
import java.util.Collections;

public class VetorList {
/*    //Exercicio

Crie um programa que:

Crie um ArrayList<String> chamado produtos
Adicione 5 produtos
Mostre todos os produtos
Remova um produto pelo nome
Mostre a lista atualizada
Verifique se existe um produto específico (ex: "Mouse") */
 
    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Mouse");
        produtos.add("Monitor");
        produtos.add("Teclado");
        produtos.add("Som");
        produtos.add("Cadeira");

        Collections.sort(produtos);
        System.out.println("Lista de produtos ordenada " + " " + produtos);

        produtos.remove("Cadeira");

        System.out.println("Item removido com sucesso");

        if(produtos.contains("Som")){
            System.out.println("A lista possue o item pedido!");
        }


        System.out.println("Lista Atualizada " + " " + produtos);

        

        
    }

}
