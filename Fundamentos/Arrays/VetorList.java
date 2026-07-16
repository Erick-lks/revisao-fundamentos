
import java.util.ArrayList;
import java.util.Collections;
public class VetorList {/*
    public static void main(String[] args) {
        

      ArrayList<String> frutas = new ArrayList<>();

      frutas.add("Banana");
      frutas.add("Perâ");
      frutas.add("Abacaxi");

      System.out.println(frutas);


      frutas.remove("Banana");

      System.out.println(frutas);

      frutas.get(0);

      System.out.println("Lista finalizada" + frutas);


    }

    //Exercicio

    📌 Requisitos

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
        produtos.add("Tv");
        produtos.add("Cabos");
        produtos.add("Som");

        produtos.remove("Som");

System.out.println("Produto Removido" );


        
if(produtos.contains("Cabos")){
    System.out.println("Temos Cabos!");
}else{
    System.out.println("Produto Indisponivel!");
}
            
            Collections.sort(produtos);

        System.out.println("Depois da ordenação: " + produtos);

   
        

}
    
}
