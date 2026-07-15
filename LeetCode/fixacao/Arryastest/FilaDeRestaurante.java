package Arryastest;

import java.util.LinkedList;

public class FilaDeRestaurante {
    public static void main(String[] args) {

        LinkedList<String> fila = new LinkedList<>();

        fila.add("Pessoa 1");      
        fila.add("Pessoa 2");        
        fila.add("Pessoa 3");        
        fila.add("Pessoa 4");   
        fila.addFirst("Preferencial 1");     
        fila.add("Pessoa 5");        
        fila.add("Pessoa 6");  
        

        
        while(!fila.isEmpty()){
        System.out.println("Fila em ordem de Prioridade " + fila.removeFirst());
        System.out.println("Em Espera" + fila);
        }
 
    }
    
}
/*Fila de restaurante: clientes entram na fila, 
uma pessoa preferencial deve entrar antes dos demais 
e os clientes devem ser atendidos um por um.
 Mostre a fila após cada atendimento.
 */