package Arryastest;

import java.util.HashSet;

public class ControledeEmails {

    public static void main(String[] args) {
        
        HashSet<String> emails = new HashSet<>();

        emails.add("test01@test.com");
        emails.add("test02@test.com");
        emails.add("test03@test.com");
        emails.add("test04@test.com");
        emails.add("test05@test.com");
        emails.add("test06@test.com");

        String emailduplicado = "test03@test.com";

        if(!emails.contains(emailduplicado)){
            System.out.println("Email ja Informado, Tente Novamente");

        }

        System.out.println("Lista do Banco de Dados de emails para o evento " + emails);
    }
    
}


/*Controle de e-mails: registre e-mails de participantes de um evento
 Se alguém tentar registrar o mesmo e-mail novamente,
  ele não deve aparecer duas vezes.
   Mostre todos os e-mails cadastrados.

*/