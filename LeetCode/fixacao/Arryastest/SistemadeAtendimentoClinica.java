package Arryastest;
/*
Exercício 3

Simule um sistema de atendimento de uma clínica.

Pessoas entram na fila de atendimento
Algumas pessoas têm prioridade
Um por um são atendidos
Mostre quem está sendo atendido e quem ainda está na fila  */

import java.util.LinkedList;

public class SistemadeAtendimentoClinica {

     public static void main(String[] args) {

        LinkedList<String> fila = new LinkedList<>();

        fila.add("Joana");
        fila.add("Romeu");
        fila.add("Woody");
        fila.add("Neide");
        fila.addFirst("Marinete");

        System.out.println("Fila inicial " + fila);

    
   while (!fila.isEmpty()) {
    System.out.println("Atendendo: " + fila.removeFirst());
    System.out.println("Fila atualizada " + fila);
}

System.out.println("Fila vazia.");
       

        


     }
    
}
/*fila.offer("Joana");   // adiciona no final
fila.peek();           // consulta o primeiro
fila.poll();           // remove o primeiro */