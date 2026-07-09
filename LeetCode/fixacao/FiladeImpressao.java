import java.util.LinkedList;

public class FiladeImpressao {

    public static void main(String[] args) {
      
      LinkedList<String> documetos = new LinkedList<>();

      documetos.add("DOC01");
      documetos.add("DOC02");
      documetos.add("DOC03");
      documetos.add("DOC04");
      documetos.add("DOC05");
      documetos.add("DOC06");

      System.out.println("Pendentes :" + documetos);
      while(!documetos.isEmpty()){
 
       System.out.println("Imprimindo :" + documetos.removeFirst());
       System.out.println("Documentos Faltantes :" + documetos);

      }

    }
    
}
/*Fila de impressão: adicione seis documentos para imprimir,
 mostre o próximo documento,
  imprima um por um e 
  informe quando não houver mais documentos.

*/