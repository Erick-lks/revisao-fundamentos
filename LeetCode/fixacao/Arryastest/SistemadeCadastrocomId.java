package Arryastest;

import java.util.HashMap;



/*🧠 Exercício 2

Crie um sistema de cadastro de usuários com ID.

Cada usuário deve ter um ID e um nome
Adicione pelo menos 5 usuários
Busque um usuário pelo ID
Remova um usuário pelo ID
Mostre todos os usuários no final
 */
public class SistemadeCadastrocomId {

    public static void main(String[] args) {
      HashMap<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Julio");
        usuarios.put(2, "Romeu");
        usuarios.put(3, "Woody");
        usuarios.put(4, "Joana");
        usuarios.put(5, "Santos");

        System.out.println("Lista inicial: " + usuarios);

        String usuarioBuscado = usuarios.get(2);
        System.out.println("Usuário buscado: " + usuarioBuscado);

        String removido = usuarios.remove(2);

        if (removido != null) {
            System.out.println("Usuário removido: " + removido);
        }

        System.out.println("Lista atualizada: " + usuarios);
    }
    
}
