
import java.util.HashSet;

public class ControledePresenca {
    public static void main(String[] args) {

        HashSet<String> alunos = new HashSet<>();

        alunos.add("João");
        alunos.add("Julio");
        alunos.add("Matheus");
        alunos.add("Julia");
        alunos.add("Gabriela");
        alunos.add("Juca");
        alunos.add("Juca");

        

        String alunoVerificado = "Julia";

        if(alunos.contains(alunoVerificado)){
            System.out.println(alunoVerificado + " estava presente ");

        }

        System.out.println("Lista de Alunos Presentes " + alunos);
    }
    
}
/*Controle de presença: receba nomes de alunos que chegaram à aula.
 Um aluno pode tentar registrar presença mais de uma vez,
  mas a lista final deve conter cada aluno apenas uma vez.
   Verifique se um aluno específico compareceu.
 */