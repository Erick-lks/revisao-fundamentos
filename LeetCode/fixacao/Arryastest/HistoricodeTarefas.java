package Arryastest;
import java.util.ArrayList;
import java.util.LinkedList;

public class HistoricodeTarefas {
    public static void main(String[] args) {
        LinkedList<String> tarefas = new LinkedList<>();
        ArrayList<String> concluidas = new ArrayList<>();

        tarefas.add("Tarefa 1");
        tarefas.add("Tarefa 2");
        tarefas.add("Tarefa 3");
        tarefas.add("Tarefa 4");
        tarefas.add("Tarefa 5");
        tarefas.add("Tarefa 6");
        tarefas.add("Tarefa 7");

        System.out.println("Lista de Tarefas: " + tarefas);

        while (!tarefas.isEmpty()) {
            String tarefaconcluida = tarefas.removeFirst();
            System.out.println("Lista de Tarefas concluidas: " + concluidas);

            concluidas.add(tarefaconcluida);
            System.out.println(
                    "Última tarefa concluída: "
                            + concluidas.get(concluidas.size() - 1));
            System.out.println("Concluindo " + tarefaconcluida);

        }
        System.out.println("Lista de Tarefas vazia ");

    }

}
/*
 * Histórico de tarefas: adicione tarefas concluídas em sequência,
 * mostre a última tarefa concluída
 * e permita desfazer a última ação.
 * Depois, mostre o histórico atualizado.
 */