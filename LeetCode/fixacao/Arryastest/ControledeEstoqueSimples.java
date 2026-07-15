package Arryastest;

import java.util.HashSet;

public class ControledeEstoqueSimples {
    public static void main(String[] args) {

        HashSet<String> estoquedeFrutas = new HashSet<>();

        estoquedeFrutas.add("Maça");
        estoquedeFrutas.add("Perâ");
        estoquedeFrutas.add("Laranja");
        estoquedeFrutas.add("Perâ");

        System.out.println("Estoque : " + estoquedeFrutas);

        if (estoquedeFrutas.contains("Jaca")) {
            System.out.println("Produto disponivel");

        } else {
            System.out.println("Produto indisponivel");
        }

    }

}
/*
 * Controle de estoque simples:
 * cadastre nomes de produtos.
 * Tente adicionar alguns nomes repetidos,
 * informe quais produtos ficaram cadastrados
 * e
 * verifique se um produto específico está disponível.
 */