
import java.util.ArrayList;
import java.util.Collections;

public class RankingdePontos {
    public static void main(String[] args) {
        
        System.out.println("Pontos de 0 a 100");
        ArrayList<Integer> pontos = new ArrayList<>();

        pontos.add(53);
        pontos.add(34);
        pontos.add(89);
        pontos.add(44);
        pontos.add(4);
        pontos.add(25);
        pontos.add(98);

        
        
        Collections.sort(pontos);
        
        System.out.println("Pontuação Inicial: " + pontos);

        if(pontos.contains(44)){
           pontos.remove(Integer.valueOf(44));
            System.out.println("Removido Pontuação Aleatoria!");
        }

        int maior =pontos.get(pontos.size()-1);
        
   System.out.println("Esse é o maior " + maior);     
   System.out.println("Pontuações restantes " + pontos);
     
    }
    
}
/*Ranking de pontuações: armazene várias pontuações,
 ordene-as da menor para a maior, 
 remova uma pontuação específica e
  informe qual é a maior pontuação restante.
 */