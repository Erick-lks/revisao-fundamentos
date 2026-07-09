public class ContarNumerosMaioresque {

    public static void main(String[] args) {
        
        //entrada
        int[] numeros = {10,15 ,20 ,40,4,5,7};
        int contador = 0;

        

        //percorrer
        for(int i = 0 ; i < numeros.length ; i++){


            System.out.println("Percorrendo o Array " + numeros[i]);

           if(numeros[i] < 10){
            contador++;
           }


           //saida
           System.out.println(contador);
        }

        
    }
    
}
