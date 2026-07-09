
/*🧠 Exercício 1

Crie um programa que gerencie uma lista de nomes.

Adicione vários nomes
Remova um nome específico
Verifique se um nome existe
Mostre todos os nomes no final */

import java.util.ArrayList;
import java.util.Collections;

public class GerenciamentodeNomes {

 public static void main(String[] args) {
    
   ArrayList<String> nomes = new ArrayList<>();

   nomes.add("Joana");
   nomes.add("Augusto");
   nomes.add("Alice");
   nomes.add("Nuno");

    Collections.sort(nomes);
    
   System.out.println("Lista de nomes inicial " + nomes);


if(nomes.remove("Alice")) {
    System.out.println("Nome removido com sucesso!");
}
  

    System.out.println("Lista de nomes atualizada " + nomes);


    String nome = "Augusto";

    if(nomes.contains(nome)){
        System.out.println("Encontrado o nome"+ " " + nome);
    }else {
    System.out.println("Nome não encontrado");
}

 System.out.println("Lista de nomes finalizada " + nomes);

 }
    
}
