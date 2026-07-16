
import java.util.LinkedList;

public class LinkList {

    public static void main(String[] args) {
        LinkedList<String> alunos = new LinkedList<>();


        alunos.add("Joao");
        alunos.add("Pedro");
        alunos.add("Joana");
        
        System.out.println(alunos);

        alunos.removeFirst();

        System.out.println("Removido o Primeiro por desistencia" + alunos);

    }
    
}
