package Arryastest;

import java.util.HashMap;

public class CatalogoDeProdutos {
    public static void main(String[] args) {
        
        HashMap<Integer,String> produtos = new HashMap<>();

        produtos.put(1, "BMW");
        produtos.put(2, "Mercedens Bens");
        produtos.put(3, "Fiat");
        produtos.put(4, "Alpha Romeu");
        produtos.put(5, "Audi");

        System.out.println("Produtos Cadastrados :" + produtos);

        if(produtos.containsKey(3)){
            produtos.put(3, "Renault");
            System.out.println("Produto alterado com sucesso!");
           
        }else{
            System.out.println("Produto não localizado");
        }

         if(produtos.containsKey(1)){
            produtos.remove(1);
            System.out.println("Produto removido com sucesso!");
           
        }else{
            System.out.println("Produto não localizado");
        }
 System.out.println("Lista Atualizada" + produtos);

    }
    
}
/*Catálogo de produtos: cadastre produtos usando código e nome. 
Busque um produto pelo código,
 altere o nome de um produto 
 e remova outro pelo código.
 Ao final, mostre todos os produtos. */