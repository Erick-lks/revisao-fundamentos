package Fundamentos.Repeticao;

import java.util.ArrayList;

public class Repeticao {
    public static void main(String[] args) {
        ArrayList<String> processos = new ArrayList<>();

        processos.add("Processo 1");
        processos.add("Processo 2");
        processos.add("Processo 3");
        processos.add("Processo 4");
        processos.add("Processo 5");

        for (int i = 0; i < processos.size(); i++) {
            System.out.println("Forma for: " + processos.get(i));

        }
        System.out.println("=========================");
        for (String processo : processos) {
            System.out.println("Forma Forech: " + processo);

        }

        System.out.println("=========================");

        int contador = 0;
        while (contador < 5) {
            System.out.println("Estou no While ate condição ser falsa");
            contador++;
        }
        System.out.println("Fim do Loop while");
    }

}
