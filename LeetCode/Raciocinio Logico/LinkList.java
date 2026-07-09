
import java.util.LinkedList;

public class LinkList {
    /*📌 Requisitos

Crie um programa que:

Crie uma LinkedList<String> chamada fila
Adicione 4 pessoas na fila
Mostre a fila inicial
Adicione uma pessoa VIP no início da fila
Remova a primeira pessoa atendida
Mostre a fila final */

public static void main(String[] args) {
    LinkedList<String> fila = new LinkedList<>();

fila.add("Pessoa 1");
fila.add("Pessoa 2");
fila.add("Pessoa 3");
fila.add("Pessoa 4");
fila.add("Pessoa 5");


System.out.println("Fila inicial" + fila);

fila.addFirst("Pessoa Preferencial");
System.out.println("Em Atendimento " + fila.peek() ); 




System.out.println("Atendido: " + fila.removeFirst());

 System.out.println("Fila final: " + fila);   

    
}





    
}
