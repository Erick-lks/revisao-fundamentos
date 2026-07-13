
import java.util.HashMap;

public class AgendaTelefonica {

    public static void main(String[] args) {

        HashMap<String,String> agenda = new HashMap<>();

    agenda.put("333 333 333", "Joao");
    agenda.put("222 222 222", "Juca");
    agenda.put("777 777 777", "Gabriela");
    agenda.put("888 888 888", "Nunes");
    agenda.put("999 999 999", "Augusto");

   

   if(!agenda.containsKey("333 333 333")){
    System.out.println("Contato não encontrado");
}

    if(agenda.containsKey("333 333 333")){
        agenda.replace("333 333 333", "Joao", "Pedro");
    }

    agenda.remove("888 888 888");
    agenda.put("444 444 444", "Alan");


      System.out.println("Agenda inicializada: " + agenda);   
    }
    
}
/*Agenda telefônica: cadastre contatos usando nome e telefone.
 Busque o telefone de um contato, 
 atualize o telefone de outro
  e remova um contato. 
  Mostre a agenda ao final.
 */